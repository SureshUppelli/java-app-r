
package com.abcbs.benefitsx12utilities.services;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.abcbs.benefitsedix12objects.models.EB;
import com.abcbs.benefitsedix12objects.models.response.extstatus.Edi271;
import com.abcbs.benefitsedix12objects.models.response.extstatus.ExtractStatuses271;
import com.abcbs.benefitsedix12objects.models.response.extstatus.Loop2110C;
import com.abcbs.benefitsedix12objects.models.response.extstatus.Results;
import com.abcbs.benefitsedix12objects.models.response.extstatus.ST;
import com.abcbs.benefitsx12utilities.models.X12ParserResponseExtStatusResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.xlate.edi.stream.EDIInputFactory;
import io.xlate.edi.stream.EDIStreamEvent;
import io.xlate.edi.stream.EDIStreamReader;

/**
 * 
 * @author	SXM
 * @version	1.0
 * @since	8-18-2022
 * @contact	ismbbbillingsys@arkbluecross.com
 * 
 *          Service class containing parser for raw x12. Use of this class
 *          requires the import of edix12objects.jar from Maven.
 */
/*
 * Document modifications here:
 */
@Service
public class BenefitsEdiResponseExtStatusHandler {

	@Autowired
	private Environment env;

	@Autowired
	private BenefitsEdiResponseExtStatusMapper mapper;

	/**
	 * Parsing method accepts raw x12 as string. An object is populated from the x12
	 * loops and segments following current edi structure standards. This parser
	 * uses the StAEDI API to allow for x12 parsing that follows a pull processing
	 * flow similar the StAX. For more details see:
	 * 
	 * https://github.com/xlate/staedi
	 * 
	 * notes about composite and repetition 
	 * http://www.rdpcrystal.com/whats-the-repetition-separator-character-in-5010-x12/
	 *  
	 * @param edi
	 * @return
	 * @throws IOException
	 * 
	 * 
	 * You should not need to handle that actually. You should be receiving 3 separate ELEMENT_DATA events, each with the occurrence specified in reader.getLocation().getElementOccurrence()
	 */
 
	private List<ST> stlist = new ArrayList<ST>();
	 
	public Edi271 parse271EdiExtractStatuses(String edi) throws IOException {
		Edi271 edi271 = new Edi271();
		EDIInputFactory factory = EDIInputFactory.newFactory();
		factory.setProperty(EDIInputFactory.EDI_VALIDATE_CONTROL_CODE_VALUES, false);
		InputStream stream = new ByteArrayInputStream(edi.getBytes());
		EDIStreamReader reader = factory.createEDIStreamReader(stream);
		EDIStreamEvent event;
		String currentSegment = "";
		String currentData = "";
		String parentLoop = "";
	//	String currentLoop = "";
		List<String> dataList = new ArrayList<String>();
		 
		List<ArrayList<String> > aList = new ArrayList<ArrayList<String> >();
		ArrayList<String> compositeList = new ArrayList<String>();
		ST currentst = new ST();
		int hlCounter = 0;
		int loopCounter = 0;
								
		int aaaLoopCounter=0;
		int	perLoopCounter=0;
		int refLoopCounter=0;
		int trnLoopCounter=0;
		int dtpLoopCounter=0;
		int msgLoopCounter=0;
		int hsdLoopCounter=0;
		int repetitionCounter=0;
		int ls2120cLoopCounter=0;
		int stCounter = 0;
		int ebCounter = 0;
		boolean isComposite = false;
		boolean isLSsegmentFound = false;
		
		 
	//	int elementcounter = 0;
		Map<String, String> loopMap = new HashMap<String, String>();
		loopMap.put("PARENT", "");
		loopMap.put("CURRENT", "");
		try {

			while (reader.hasNext()) {
				switch (reader.next()) {
				case START_INTERCHANGE:
					String standard = reader.getStandard();
					String[] version = reader.getVersion();
					break;
				 case START_LOOP:
					 System.out.println("i'm here with segment " +currentSegment );
				case START_SEGMENT:
					currentSegment = reader.getText();
				
					if (currentSegment.equals("ST")) {
						stCounter++;
						currentst = new ST();
					}
					if (currentSegment.equals("SE"))
						hlCounter = 0;
					if (currentSegment.equals("NM1")) {
						if(parentLoop.equals("Loop2000A"))
							parentLoop = "Loop2100A";	
						if(parentLoop.equals("Loop2000B"))
							parentLoop = "Loop2100B";	
						if(parentLoop.equals("Loop2000C"))
							parentLoop = "Loop2100C";
					}
										
					if (currentSegment.equals("EB")) {
						ebCounter++;
						//if(parentLoop.equals("Loop2100C"))
							parentLoop = "Loop2110C";						
					}    
					if (currentSegment.equals("III")) {
					//	if(parentLoop.equals("Loop2110C"))
							parentLoop = "Loop2115C";						
					}  
					if (currentSegment.equals("LS")) {
					//	if(parentLoop.equals("Loop2110C"))
							isLSsegmentFound=true;
					} 
					if (isLSsegmentFound && currentSegment.equals("NM1")) {
						parentLoop = "Loop2120C";						 
					}
					dataList = new ArrayList<String>();
					break;
				case END_SEGMENT:
					if(currentSegment.equals("HL")){
						hlCounter++;
						parentLoop = getLoop(dataList);
						//currentLoop =parentLoop;
					}
					 
					
					if (currentSegment.equals("AAA") ) {						
						aaaLoopCounter++;
						loopCounter=aaaLoopCounter;
					}
					if ( currentSegment.equals("PER")) {						
						perLoopCounter++;
						loopCounter=perLoopCounter;
					}
					if ( currentSegment.equals("REF")) {
						 
						refLoopCounter++;
						loopCounter=refLoopCounter;
					}
					if (currentSegment.equals("TRN")) {
						 
						trnLoopCounter++;
						loopCounter=trnLoopCounter;
					}
					if ( currentSegment.equals("DTP")) {
						 
						dtpLoopCounter++;
						loopCounter=dtpLoopCounter;
					}
					if ( currentSegment.equals("MSG")) {
						 
						msgLoopCounter++;
						loopCounter=msgLoopCounter;
					}
					if (currentSegment.equals("HSD")) {						
						hsdLoopCounter++;
						loopCounter=hsdLoopCounter;
					}
					if (isLSsegmentFound && currentSegment.equals("NM1")) {					
						ls2120cLoopCounter++;
						loopCounter=ls2120cLoopCounter;
					}
					
					if("EB".equals(currentSegment)) {
						if (repetitionCounter > 1) {
						   loopCounter=repetitionCounter;
						}else {
							loopCounter=1;
						}
						
					}
				
		//			elementcounter = 0;
//					if(currentSegment.equals("BHT") ||currentSegment.equals("GE") ||currentSegment.equals("IEA") || currentSegment.equals("ISA") 
//							||currentSegment.equals("DTP") || currentSegment.equals("NM1") || currentSegment.equals("ST")  
//							|| currentSegment.equals("SE") ||currentSegment.equals("EB") ||currentSegment.equals("GS")
//							) {
						edi271 = updateSegment271(edi271, stCounter, ebCounter, hlCounter, loopCounter,currentSegment, dataList,
								aList, parentLoop, currentst);
							
//					}
					
					//if parentloop changes then reset the loopCounter // add this logic 
					aList = new ArrayList<ArrayList<String> >();
					loopCounter=0;

					repetitionCounter=0;
					
					if (isLSsegmentFound) {
						loopCounter=ls2120cLoopCounter;
					}
					if (currentSegment.equals("LE")) {
						ls2120cLoopCounter=0;
						isLSsegmentFound=false;
					}
				
					
					
					if(currentSegment.equals("HL") || currentSegment.equals("NM1") || currentSegment.equals("EB")){
						aaaLoopCounter=0;
						perLoopCounter=0;
						perLoopCounter=0;
						refLoopCounter=0;
						trnLoopCounter=0;
						dtpLoopCounter=0;
						msgLoopCounter=0;
						hsdLoopCounter=0;
						//lsloopCounter=0;
						 
					}
					break;
				case START_COMPOSITE:
					if (currentSegment.equals("EB") || currentSegment.equals("HI")) {
						
						compositeList = new ArrayList<String>();
						isComposite = true;
					}
					 
					break;
				case END_COMPOSITE:
					if (currentSegment.equals("EB") ||currentSegment.equals("HI"))
						if (compositeList != null && compositeList.size() > 0) {
							aList.add(compositeList);	
						}
						isComposite = false;
					break;
				case ELEMENT_DATA:
			//		elementcounter++;
					currentData = reader.getText();
				
					if("EB".equals(currentSegment)) {
						if (reader.getLocation().getElementOccurrence() > 1) {
							repetitionCounter =reader.getLocation().getElementOccurrence() ;
						}
					}
					if (currentSegment.equals("EB") || currentSegment.equals("HI")) {
						if (isComposite) {
							compositeList.add(currentData);
						    
						}else
							dataList.add(currentData);
					} else
						dataList.add(currentData);
					break;
				}
			}

			reader.close();
			stream.close();
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//					new ApplicationException(ex, env.getProperty("spring.application.name")));
			ex.printStackTrace();
		} finally {
		}

		return edi271;

	}
	/**
	 * Sets the contents of current loop or segment using dataList populated from
	 * parsing method.
	 * 
	 * @param edi271
	 * @param stCounter
	 * @param hlCounter
	 * @param currentSegment
	 * @param dataList
	 * @param currentloop
	 * @param currentst
	 * @return
	 */
	public Edi271 updateSegment271(Edi271 edi271, int stCounter, int ebCounter, int hlCounter,int loopCounter,
			String currentSegment, List<String> dataList, List<ArrayList<String> > aList, String currentloop,
			ST currentst) {

		try {

			if (hlCounter == 0) {
				switch (currentSegment) {
//				case "ISA":
//					edi271 = mapper.mapIsa(edi271, dataList);
//					break;
//				case "GS":
//					edi271 = mapper.mapGs(edi271, dataList);
//					break;
				case "ST":
					currentst = mapper.mapSt(currentst, dataList);
					edi271.getStlist().add(currentst);
//					break;
//				case "SE":
//					edi271 = mapper.mapSe(edi271, stCounter - 1, dataList);
//					break;
//				case "BHT":
//					edi271 = mapper.mapBht(edi271, stCounter - 1, dataList);
//					break;
//				case "GE":
//					edi271 = mapper.mapGe(edi271, dataList);
//					break;
//				case "IEA":
//					edi271 = mapper.mapIea(edi271, dataList);
//					break;
				}
			} else {
				switch (currentloop) {
				case "Loop2000A":
					edi271 = mapper.mapLoop2000A(edi271, stCounter - 1, loopCounter-1, dataList, currentSegment);
					break;
				case "Loop2100A":
					edi271 = mapper.mapLoop2100A(edi271, stCounter - 1, loopCounter-1, dataList, currentSegment);
					break;
				case "Loop2000B":
					edi271 = mapper.mapLoop2000B(edi271, stCounter - 1, loopCounter-1,dataList, currentSegment);
					break;
				case "Loop2100B":
					edi271 = mapper.mapLoop2100B(edi271, stCounter - 1, loopCounter-1,dataList, currentSegment);
					break;
				case "Loop2000C":
					edi271 = mapper.mapLoop2000C(edi271, stCounter - 1, loopCounter-1,dataList, currentSegment);
					break;
				case "Loop2100C":
					edi271 = mapper.mapLoop2100C(edi271, stCounter - 1, loopCounter-1,dataList, aList,currentSegment);
					break;
				case "Loop2110C":
					edi271 = mapper.mapLoop2110C(edi271, stCounter - 1, ebCounter - 1, loopCounter - 1, dataList,
							/* compositeList, */ aList, currentSegment);
					break;
				case "Loop2115C":
					edi271 = mapper.mapLoop2115C(edi271, stCounter - 1, ebCounter - 1, loopCounter - 1, dataList,
							/* compositeList, */currentSegment);
					break;
				case "Loop2120C":
					edi271 = mapper.mapLoop2120C(edi271, stCounter - 1, ebCounter - 1, loopCounter - 1, dataList,
							/* compositeList, */currentSegment);
					break;
				}
			}
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi271;
	}

	/**
	 * Sets current loop.
	 * 
	 * @param hlCounter
	 * @return
	 */
 
	
	public String getLoop(List<String> dataList) {
		String loop = "";
		String levelCode = dataList.get(2).trim();
		try {

			switch (levelCode) {
			case "20":
				loop = "Loop2000A";
				break;
			case "21":
				loop = "Loop2000B";
				break;
			case "22":
				loop = "Loop2000C";
				break;			
			}
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}
		return loop;
	}
	
    public String generateExtractStatuses(X12ParserResponseExtStatusResponse response) throws JsonProcessingException {
    	
    	stlist =response.getResults().getStlist();
    	// Create a map with a string key member# and the list of strings value
        Map<String, List<EB>> statusMap = new HashMap<>();
        Map<String, String> statusMbrEbListMap = new HashMap<>();
        
        
    	String mbr = null;
    	List<EB> ebList = new ArrayList<>();
    	
    	
    	 
    	
    	boolean isRejected=false;
    	for(ST st : stlist) {
    		//now check if any of the loop received AAA segment information
    		if (st.getLoop2000a().getAaamap().size() > 0)
    			isRejected=true;
    		if(!isRejected) {
    			if (st.getLoop2000a().getLoop2100a().getAaamap().size() > 0)
    				isRejected=true;
    		}
    		if(!isRejected) {
    			if (st.getLoop2000b().getLoop2100b().getAaamap().size() > 0)
    				isRejected=true;
    		}
    		if(!isRejected) {
    			if (st.getLoop2000b().getLoop2100b().getAaamap().size() > 0)
    				isRejected=true;
    		}	
    		if(!isRejected) {
    			if (st.getLoop2000c().getLoop2100c().getAaamap().size() > 0)
    				isRejected=true;
    		}
    		
    		mbr = st.getLoop2000c().getLoop2100c().getNm1().getNm109();
    		mbr = mbr.substring(mbr.length() - 10);
    		
    		for(Loop2110C loop2110c :st.getLoop2000c().getLoop2100c().getLoop2110c()) {
    			if(!isRejected) {
        			if (loop2110c.getAaamap().size() > 0)
        				isRejected=true;
        		}
    			ebList.add(loop2110c.getEb());    			
    		}
    		  statusMap.put(mbr, ebList);
    	}
    	 
    	
    	
//    	  // Accessing only the elements of eb03 in comma-delimited format
//        StringBuilder output = new StringBuilder();
//        for (EB eb : ebList) {
//            Map<Integer, String> eb03Map = eb.getEb03();
//            for (Map.Entry<Integer, String> entry : eb03Map.entrySet()) {
//                output.append(entry.getValue()).append(",");
//            }
//        }
//        
//        // Remove the trailing comma if needed
//        if (output.length() > 0) {
//            output.deleteCharAt(output.length() - 1);
//        }
//        System.out.println(output.toString());
//        
        
        // Accessing only the elements of eb03 in comma-delimited format and remove dups
        Set<String> outputSet = new HashSet<>();
        for (EB eb : ebList) {
            Map<Integer, String> eb03Map = eb.getEb03();
            for (String value : eb03Map.values()) {
                outputSet.add(value);
            }
        }
        
        // Convert set to comma-delimited or pipe-delimited string
        StringBuilder output = new StringBuilder();
        for (String value : outputSet) {
            output.append(value).append("|");
        }
        
        // Remove the trailing comma or pipe if needed
        if (output.length() > 0) {
            output.deleteCharAt(output.length() - 1);
        }
        
        System.out.println(output.toString());
        
        // Create a Results object and populate it with values
        Results results = new Results();
        results.setIdType("MBR");
        results.setSegment("EB");
        if (isRejected) 
        	results.setOverallStatus("REJECTED");
        else
        	results.setOverallStatus("SUCCESS");
        
         
       // results.setStatusList(statusMap);
        statusMbrEbListMap.put(mbr,output.toString());
        results.setStatusEbList(statusMbrEbListMap);

        // Create a Payload object and populate it with values, including the Results object
        ExtractStatuses271 payload = new ExtractStatuses271();
        payload.setPayloadType("271");
        payload.setParseType("");
        payload.setTransactionStatus(response.getMessage());
        
       
        payload.setHttpStatus(200);
        payload.setHttpReason("OK");
        payload.setMessage("Transaction parsing successful.");
        
    
        
        payload.setTimestamp(response.getTimestamp());
        
        payload.setTransactionId("abc");
        payload.setResults(results);
        
    	
    	
    	// Convert the Payload object to a JSON string using the ObjectMapper class
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(payload);
    }

}
