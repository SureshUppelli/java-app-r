package com.abcbs.benefitsx12utilities.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.abcbs.benefitsedix12objects.models.AAA;
import com.abcbs.benefitsedix12objects.models.DTP;
import com.abcbs.benefitsedix12objects.models.EB;
import com.abcbs.benefitsedix12objects.models.HI;
import com.abcbs.benefitsedix12objects.models.HSD;
import com.abcbs.benefitsedix12objects.models.III;
import com.abcbs.benefitsedix12objects.models.MSG;
import com.abcbs.benefitsedix12objects.models.NM1;
import com.abcbs.benefitsedix12objects.models.PER;
import com.abcbs.benefitsedix12objects.models.REF;
import com.abcbs.benefitsedix12objects.models.TRN;
import com.abcbs.benefitsedix12objects.models.response.Edi271;
import com.abcbs.benefitsedix12objects.models.response.Loop2110C;
import com.abcbs.benefitsedix12objects.models.response.Loop2115C;
import com.abcbs.benefitsedix12objects.models.response.Loop2120C;
import com.abcbs.benefitsedix12objects.models.response.ST;



/**
 * 
 * 
 * @author	SXM
 * @version	1.0
 * @since	8-18-2022
 * @contact	ismbbbillingsys@arkbluecross.com
 * 
 *          Service class that maps segment contents.
 */
/*
 * Document modifications here:
 */
@Service
public class BenefitsEdiResponseMapper {

	@Autowired
	private Environment env;

	public Edi271 mapIsa(Edi271 edi, List<String> data) {

		try {
			int iterator = 0;

			edi.getIsa().setIsa01(data.get(iterator++));
			edi.getIsa().setIsa02(data.get(iterator++));
			edi.getIsa().setIsa03(data.get(iterator++));
			edi.getIsa().setIsa04(data.get(iterator++));
			edi.getIsa().setIsa05(data.get(iterator++));
			edi.getIsa().setIsa06(data.get(iterator++));
			edi.getIsa().setIsa07(data.get(iterator++));
			edi.getIsa().setIsa08(data.get(iterator++));
			edi.getIsa().setIsa09(data.get(iterator++));
			edi.getIsa().setIsa10(data.get(iterator++));
			edi.getIsa().setIsa11(data.get(iterator++));
			edi.getIsa().setIsa12(data.get(iterator++));
			edi.getIsa().setIsa13(data.get(iterator++));
			edi.getIsa().setIsa14(data.get(iterator++));
			edi.getIsa().setIsa15(data.get(iterator++));
			edi.getIsa().setIsa16(data.get(iterator++));
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi;
	}

	public Edi271 mapGs(Edi271 edi, List<String> data) {
		int iterator = 0;

		try {
			edi.getGs().setGs01(data.get(iterator++));
			edi.getGs().setGs02(data.get(iterator++));
			edi.getGs().setGs03(data.get(iterator++));
			edi.getGs().setGs04(data.get(iterator++));
			edi.getGs().setGs05(data.get(iterator++));
			edi.getGs().setGs06(data.get(iterator++));
			edi.getGs().setGs07(data.get(iterator++));
			edi.getGs().setGs08(data.get(iterator++));
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi;
	}

	public Edi271 mapGe(Edi271 edi, List<String> data) {
		int iterator = 0;

		try {
			edi.getGe().setGe01(data.get(iterator++));
			edi.getGe().setGe02(data.get(iterator++));
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi;
	}

	public Edi271 mapSe(Edi271 edi, int stCounter, List<String> data) {
		int iterator = 0;

		try {
			edi.getStlist().get(stCounter).getSe().setSe01(data.get(iterator++));
			edi.getStlist().get(stCounter).getSe().setSe02(data.get(iterator++));
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi;
	}

	public Edi271 mapIea(Edi271 edi, List<String> data) {
		int iterator = 0;

		try {
			edi.getIea().setIea01(data.get(iterator++));
			edi.getIea().setIea02(data.get(iterator++));
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi;
	}

	public ST mapSt(ST sT, List<String> data) {
		int iterator = 0;

		try {
			sT.setSt01(data.get(iterator++));
			sT.setSt02(data.get(iterator++));
			sT.setSt03(data.get(iterator++));
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return sT;
	}

	public Edi271 mapBht(Edi271 edi, int stCounter, List<String> data) {
		int iterator = 0;

		try {
			edi.getStlist().get(stCounter).getBht().setBht01(data.get(iterator++));
			edi.getStlist().get(stCounter).getBht().setBht02(data.get(iterator++));
			edi.getStlist().get(stCounter).getBht().setBht03(data.get(iterator++));
			edi.getStlist().get(stCounter).getBht().setBht04(data.get(iterator++));
			edi.getStlist().get(stCounter).getBht().setBht05(data.get(iterator++));
			/*
			 * Edi standards state that BHT06 is not currently used
			 */
			// edi.getBht().setBht06(data.get(iterator++));
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi;
	}

	
	 
	public Edi271 mapLoop2000A(Edi271 edi271, int stCounter, int loopCounter,List<String> data,  String currentSegment) {
		int iterator = 0;

		try {
			switch (currentSegment) {
			case "HL":
				edi271.getStlist().get(stCounter).getLoop2000a().getHl().setHl01(data.get(iterator++));
				/*
				 * No hierarchical parent exists yet so HL02 value will be empty
				 */
				edi271.getStlist().get(stCounter).getLoop2000a().getHl().setHl02(data.get(iterator++));
				edi271.getStlist().get(stCounter).getLoop2000a().getHl().setHl03(data.get(iterator++));
				edi271.getStlist().get(stCounter).getLoop2000a().getHl().setHl04(data.get(iterator++));
				break;
			case "AAA": // repeat 9 times
				AAA aaa = new AAA();
				aaa.setAaa01(data.get(iterator++));
				aaa.setAaa02(data.get(iterator++));
				aaa.setAaa03(data.get(iterator++));
				aaa.setAaa04(data.get(iterator++));
				edi271.getStlist().get(stCounter).getLoop2000a().getAaamap().put(loopCounter, aaa);
				break;
			}

		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi271;
	}
	public Edi271 mapLoop2100A(Edi271 edi271, int stCounter, int loopCounter,List<String> data,  String currentSegment) {
		int iterator = 0;

		try {
			switch (currentSegment) {
			 
			case "NM1":
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						edi271.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm101(data.get(i));
						break;
					case 1:
						edi271.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm102(data.get(i));
						break;
					case 2:
						edi271.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm103(data.get(i));
						break;
					case 3:
						edi271.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm104(data.get(i));
						break;
					case 4:
						edi271.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm105(data.get(i));
						break;
					case 5:
						edi271.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm106(data.get(i));
						break;
					case 6:
						edi271.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm107(data.get(i));
						break;
					case 7:
						edi271.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm108(data.get(i));
						break;
					case 8:
						edi271.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm109(data.get(i));
						break;
					case 9:
						edi271.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm110(data.get(i));
						break;
					case 10:
						edi271.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm111(data.get(i));
						break;
					case 11:
						edi271.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm112(data.get(i));
						break;
					}
				}
				break;
			
			case "PER": // repeat 3 times
				PER per = new PER();
				for (int i = 0; i < data.size(); i++) {
					switch (i) {
					case 0:
						per.setPer01(data.get(iterator++));
						break;
					case 1:
						per.setPer02(data.get(iterator++));
						break;
					case 2:
						per.setPer03(data.get(iterator++));
						break;
					case 3:
						per.setPer04(data.get(iterator++));
						break;
					case 4:
						per.setPer05(data.get(iterator++));
						break;
					case 5:
						per.setPer06(data.get(iterator++));
						break;
					case 6:
						per.setPer07(data.get(iterator++));
						break;
					case 7:
						per.setPer08(data.get(iterator++));
						break;
					case 8:
						per.setPer09(data.get(iterator++));
						break;
					}
				}	    
				
				edi271.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getPermap().put(loopCounter, per);

				break;
			case "AAA": // repeat 9 times
				AAA aaa = new AAA();
				aaa.setAaa01(data.get(iterator++));
				aaa.setAaa02(data.get(iterator++));
				aaa.setAaa03(data.get(iterator++));
				aaa.setAaa04(data.get(iterator++));
				edi271.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getAaamap().put(loopCounter, aaa);
				break;
			}
	
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi271;
	}
	
	public Edi271 mapLoop2000B(Edi271 edi271, int stCounter, int loopCounter,  List<String> data, String currentSegment) {
		int iterator = 0;

		try {
			switch (currentSegment) {
			case "HL":
				edi271.getStlist().get(stCounter).getLoop2000b().getHl().setHl01(data.get(iterator++));
				edi271.getStlist().get(stCounter).getLoop2000b().getHl().setHl02(data.get(iterator++));
				edi271.getStlist().get(stCounter).getLoop2000b().getHl().setHl03(data.get(iterator++));
				edi271.getStlist().get(stCounter).getLoop2000b().getHl().setHl04(data.get(iterator++));
				break;
				
			}
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi271;
	}
	public Edi271 mapLoop2100B(Edi271 edi271, int stCounter, int loopCounter,  List<String> data, String currentSegment) {
		int iterator = 0;

		try {
			switch (currentSegment) {
			 
			case "NM1":
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm101(data.get(i));
						break;
					case 1:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm102(data.get(i));
						break;
					case 2:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm103(data.get(i));
						break;
					case 3:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm104(data.get(i));
						break;
					case 4:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm105(data.get(i));
						break;
					case 5:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm106(data.get(i));
						break;
					case 6:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm107(data.get(i));
						break;
					case 7:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm108(data.get(i));
						break;
					case 8:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm109(data.get(i));
						break;
					case 9:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm110(data.get(i));
						break;
					case 10:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm111(data.get(i));
						break;
					case 11:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm112(data.get(i));
						break;
					}
				}
				break;
			
			case "REF":
				
				REF ref = new REF();
				ref.setRef01(data.get(iterator++));
				ref.setRef02(data.get(iterator++));
				/*
				 * REF03 - REF04 are not used in this loop and will be empty
				 */
				edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getRefmap().put(loopCounter, ref);
				
				break;	
			case "N3":
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN3().setN301(data.get(i));
						break;
					case 1:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN3().setN302(data.get(i));
						break;					 
					}
				}
				break;	
			case "N4":
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN4().setN401(data.get(i));
						break;
					case 1:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN4().setN402(data.get(i));
						break;
					case 2:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN4().setN403(data.get(i));
						break;
					case 3:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN4().setN404(data.get(i));
						break;
					case 4:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN4().setN405(data.get(i));
						break;
					case 5:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN4().setN406(data.get(i));
						break;
					case 6:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN4().setN407(data.get(i));
						break;
						
					}
				}
				break;	
			case "AAA": // repeat 9 times
				AAA aaa = new AAA();
				aaa.setAaa01(data.get(iterator++));
				aaa.setAaa02(data.get(iterator++));
				aaa.setAaa03(data.get(iterator++));
				aaa.setAaa04(data.get(iterator++));
				edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getAaamap().put(loopCounter, aaa);
				break;
			case "PRV":
				for(int i=0;i<data.size();i++)
				{
					iterator++;
					switch(i) 
					{
					case 0: 				
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getPrv().setPrv01(data.get(i));
					    break;
					case 1:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getPrv().setPrv02(data.get(i));						
					    break;	
					case 2:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getPrv().setPrv03(data.get(i));
						 break;
					case 3:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getPrv().setPrv04(data.get(i));
						 break;
					case 4:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getPrv().setPrv05(data.get(i));
						 break;
					case 5:
						edi271.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getPrv().setPrv06(data.get(i));
						 break;
					 
					default:
					    break; 
					}
				}
				 
				
				break;
			}
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi271;
	}
	 

	public Edi271 mapLoop2000C(Edi271 edi271, int stCounter, int loopCounter, List<String> data, String currentSegment) {
		int iterator = 0;

		try {
			switch (currentSegment) {
			case "HL":
				edi271.getStlist().get(stCounter).getLoop2000c().getHl().setHl01(data.get(iterator++));
				edi271.getStlist().get(stCounter).getLoop2000c().getHl().setHl02(data.get(iterator++));
				edi271.getStlist().get(stCounter).getLoop2000c().getHl().setHl03(data.get(iterator++));
				edi271.getStlist().get(stCounter).getLoop2000c().getHl().setHl04(data.get(iterator++));
				break;
			case "TRN":
				TRN trn = new TRN();
				
				for (int i = 0; i < data.size(); i++) {
					switch(i) {
					case 0:
						trn.setTrn01(data.get(iterator++));
						break;
					case 1:
						trn.setTrn02(data.get(iterator++));
						break;
					case 3:
						trn.setTrn03(data.get(iterator++));
						break;
					case 4:
						trn.setTrn04(data.get(iterator++));
						break;	
					}				
				}				
				edi271.getStlist().get(stCounter).getLoop2000c().getTrnmap().put(loopCounter, trn);
				
				break;	
			}

		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi271;
	}

	public Edi271 mapLoop2100C(Edi271 edi271, int stCounter, int loopCounter, List<String> data, List<ArrayList<String> > aList,String currentSegment) {
		int iterator = 0;

		try {
			switch (currentSegment) {
			case "NM1":
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm101(data.get(i));
						break;
					case 1:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm102(data.get(i));
						break;
					case 2:						
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm103(data.get(i));
						break;
					case 3:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm104(data.get(i));
						break;
					case 4:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm105(data.get(i));
						break;
					case 5:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm106(data.get(i));
						break;
					case 6:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm107(data.get(i));
						break;
					case 7:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm108(data.get(i));
						break;
					case 8:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm109(data.get(i));
						break;
					case 9:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm110(data.get(i));
						break;
					case 10:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm111(data.get(i));
						break;
					case 11:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm112(data.get(i));

					default:
						break;
					}
				}
				break;
				
			case "REF":
				REF ref = new REF();
				ref.setRef01(data.get(iterator++));
				ref.setRef02(data.get(iterator++));
			//	ref.setRef03(data.get(iterator++));
			//	ref.setRef04(data.get(iterator++));
				
				for (int i = 0; i < data.size(); i++)						
				   edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getRefmap().put(i, ref);
				break;
			case "N3":
				//int i = data.size();
				for(int i=0;i<data.size();i++)
				{
					iterator++;
					switch(i) 
					{
					case 0: 				
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN3().setN301(data.get(i));
					    break;
					case 1:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN3().setN302(data.get(i));
					    break;				
					default:
					    break; 
					}
				}
				 break;
			case "N4":
				for(int i=0;i<data.size();i++)
				{
					iterator++;
					switch(i) 
					{
					case 0: 				
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN401(data.get(i));
					    break;
					case 1:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN402(data.get(i));						
					    break;	
					case 2:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN402(data.get(i));
						 break;
					case 3:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN403(data.get(i));
						 break;
					case 4:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN404(data.get(i));
						 break;
					case 5:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN405(data.get(i));
						 break;
					case 6:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN406(data.get(i));
						 break;
					case 7:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN407(data.get(i));
						 break;
					default:
					    break; 
					}
				}
				 break;
			case "AAA": // repeat 9 times
				AAA aaa = new AAA();
				aaa.setAaa01(data.get(iterator++));
				aaa.setAaa02(data.get(iterator++));
				aaa.setAaa03(data.get(iterator++));
				aaa.setAaa04(data.get(iterator++));
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getAaamap().put(loopCounter, aaa);
				break;
			 
			case "PRV":
				for(int i=0;i<data.size();i++)
				{
					iterator++;
					switch(i) 
					{
					case 0: 				
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getPrv().setPrv01(data.get(i));
					    break;
					case 1:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getPrv().setPrv02(data.get(i));						
					    break;	
					case 2:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getPrv().setPrv03(data.get(i));
						 break;
					case 3:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getPrv().setPrv04(data.get(i));
						 break;
					case 4:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getPrv().setPrv05(data.get(i));
						 break;
					case 5:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getPrv().setPrv06(data.get(i));
						 break;
					 
					default:
					    break; 
					}
				}
				 
				
				break;
			case "DMG":
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg01(data.get(iterator++));
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg02(data.get(iterator++));
				/*
				 * DMG03 is situational in this loop and may or may not be empty
				 */
				if (iterator < data.size())
					edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg03(data.get(iterator++));
				/*
				 * DMG04 - DMG11 are not used in this loop and will be empty
				 */
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg04("");
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg05("");
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg06("");
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg07("");
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg08("");
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg09("");
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg10("");
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg11("");
				break;
			case "INS":
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns01(data.get(i));
						break;
					case 1:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns02(data.get(i));
						break;
					case 2:						
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns03(data.get(i));
						break;
					case 3:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns04(data.get(i));
						break;
					case 4:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns05(data.get(i));
						break;
					case 5:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns06(data.get(i));
						break;
					case 6:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns07(data.get(i));
						break;
					case 7:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns08(data.get(i));
						break;
					case 8:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns09(data.get(i));
						break;
					case 9:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns10(data.get(i));
						break;
					case 10:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns11(data.get(i));
						break;
					case 11:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns12(data.get(i));
						break;
					case 12:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns13(data.get(i));
						break;
					case 13:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns14(data.get(i));
						break;
					case 14:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns15(data.get(i));
						break;
					case 15:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns16(data.get(i));
						break;
					case 16:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns17(data.get(i));
						break;

					default:
						break;
					}
				} 
				break;
			case "HI":
				HI hi = new HI();
//				for (int i = 0; i < aList.size(); i++)
//					hi.getHi01().put((i + 1), aList.get(0).get(i));
				
				for (int i = 0; i < aList.size(); i++) {
		            for (int j = 0; j < aList.get(i).size(); j++) {
		            	switch (i) {
						case 0:
							hi.getHi01().put(( j), aList.get(i).get(j));
							break;
						case 1:
							hi.getHi02().put(( j), aList.get(i).get(j));
							break;
						case 2:
							hi.getHi03().put(( j), aList.get(i).get(j));
							break;
						case 3:
							hi.getHi04().put(( j), aList.get(i).get(j));
							break;
						case 4:
							hi.getHi05().put(( j), aList.get(i).get(j));
							break;
						case 5:
							hi.getHi06().put(( j), aList.get(i).get(j));
							break;
						case 6:
							hi.getHi07().put((j), aList.get(i).get(j));
							break;
						case 7:
							hi.getHi08().put(( j), aList.get(i).get(j));
							break;
							
		            }
		           }
		        }
		      
				//rest of HI's are not used.
				
		        edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().setHi(hi);
				
			
				break;
			case "DTP":
				DTP dtp = new DTP();
				dtp.setDtp01(data.get(iterator++));
				dtp.setDtp02(data.get(iterator++));
				dtp.setDtp03(data.get(iterator++));
				
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDtpmap().put(loopCounter, dtp);
				break;	
			
			 
		case "MPI":
			for(int i=0;i<data.size();i++)
			{
				iterator++;
				switch(i) 
				{
				case 0: 				
					edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getMpi().setMpi01(data.get(i));
				    break;
				case 1:
					edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getMpi().setMpi02(data.get(i));						
				    break;	
				case 2:
					edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getMpi().setMpi03(data.get(i));
					 break;
				case 3:
					edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getMpi().setMpi04(data.get(i));
					 break;
				case 4:
					edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getMpi().setMpi05(data.get(i));
					 break;
				case 5:
					edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getMpi().setMpi06(data.get(i));
					 break;
				 case 6:
					edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getMpi().setMpi07(data.get(i));
					 break;
				default:
				    break; 
				}
			}
			 
			}
			 
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi271;
	}

	 
	public Edi271 mapLoop2110C(Edi271 edi271, int stCounter, int ebCounter, int loopCounter, List<String> data,
			/* List<String> composite, */  List<ArrayList<String> > aList, String currentSegment) {
		int iterator = 0;

		try {
			switch (currentSegment) {
			case "EB":
				EB eb = new EB();
				
				for (int i = 0; i < data.size(); i++) {
					
					switch (iterator) {
					case 0:
						eb.setEb01(data.get(i));
						iterator++;
						break;
					case 1:
						eb.setEb02(data.get(i));
						iterator++;
						break;
					case 2:
						for(int k=0; k <=loopCounter; k++) {
						   eb.getEb03().put((k),data.get(i));
						   i++;
						}					
						if (loopCounter > -1)//decrease only when repeatable data exist
						   i--;
						iterator++;
						break;
					case 3:
						eb.setEb04(data.get(i));
						iterator++;
						break;
					case 4:
						eb.setEb05(data.get(i));
						iterator++;
						break;
					case 5:
						eb.setEb06(data.get(i));
						iterator++;
						break;
					case 6:
						eb.setEb07(data.get(i));
						iterator++;
						break;
					case 7:
						eb.setEb08(data.get(i));
						iterator++;
						break;
					case 8:
						eb.setEb09(data.get(i));
						iterator++;
						break;
					case 9:
						eb.setEb10(data.get(i));
						iterator++;
						break;
					case 10:
						eb.setEb11(data.get(i));
						iterator++;
						break;
					case 11:
						eb.setEb12(data.get(i));
						iterator++;
						break;
					
						//sumaja -- needs to work on rest of EB's and repetition
					
						
						
						
				/*	case 12:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter)
								.getEb().setEb13(data.get(i));
						break;
					case 13:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter)
								.getEb().setEb09(data.get(i));
						break;*/
					default:
						break;
					}
				 
				}

				// EB13 and and EB14 can be out of above loop as these are loaded from aList 
				if (aList.size() > 0) {
			
					//complete all composites Eb13 and EB14 here only as we get the data in list of arraylists
					for (int k = 0; k < aList.size(); k++) {
						for (int j = 0; j < aList.get(k).size(); j++) {
							switch (k) {
								case 0:
									eb.getEb13().put((j), aList.get(k).get(j));
									break;
								case 1:
									eb.getEb14().put((j), aList.get(k).get(j));   
									break;
							}
						}
					}
					iterator++;
					
				}
				 
				Loop2110C loop2110c = new Loop2110C();
				loop2110c.setEb(eb);
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().add(loop2110c);

				break;
			 
			
			 
			case "HSD":
				HSD hsd = new HSD();
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						hsd.setHsd01(data.get(i));
						break;
					case 1:
						hsd.setHsd02(data.get(i));
						break;
					case 2:
						hsd.setHsd03(data.get(i));
						break;
					case 3:
						hsd.setHsd04(data.get(i));
						break;
					case 4:
						hsd.setHsd05(data.get(i));
						break;
					case 5:
						hsd.setHsd06(data.get(i));
						break;
					case 6:
						hsd.setHsd07(data.get(i));
						break;
					case 7:
						hsd.setHsd08(data.get(i));
						break;
					}

				}

				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter)
						.getHsdmap().put(loopCounter, hsd);
				break;
			case "REF":
				REF ref = new REF();
				ref.setRef01(data.get(iterator++));
				ref.setRef02(data.get(iterator++));
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter)
						.setRef(ref);
				break;
			case "DTP":
				DTP dtp = new DTP();
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						dtp.setDtp01(data.get(i));
						break;
					case 1:
						dtp.setDtp02(data.get(i));
						break;
					case 2:
						dtp.setDtp03(data.get(i));
						break;	
					}
				 }
				
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getDtpmap().put(loopCounter, dtp);
				break;
			case "AAA": // repeat 9 times
				AAA aaa = new AAA();
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						aaa.setAaa01(data.get(i));
						break;
					case 1:
						aaa.setAaa02(data.get(i));
						break;
					case 2:
						aaa.setAaa03(data.get(i));
						break;	
					case 3:
						aaa.setAaa04(data.get(i));
						break;	
					}
				 }
				 
			
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getAaamap().put(loopCounter, aaa);
				
				break;
			case "MSG": // repeat 9 times
				MSG msg = new MSG();
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						msg.setMsg01(data.get(i));
						break;
					case 1:
						msg.setMsg02(data.get(i));
						break;
					case 2:
						msg.setMsg03(data.get(i));
						break;					
					}
					}
				
				
				
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getMsgmap().put(loopCounter, msg);
			 

				break;
 
					
		}
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi271;
	}
	public Edi271 mapLoop2115C(Edi271 edi271, int stCounter, int ebCounter, int loopCounter, List<String> data,
			/* List<String> composite, */ String currentSegment) {
		int iterator = 0;

		try {
			switch (currentSegment) {
			 
			case "III":
				III iii = new III();
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						iii.setIii01(data.get(i));
						break;
					case 1:
						iii.setIii02(data.get(i));
						break;
					case 2:
						iii.setIii03(data.get(i));
						break;
					case 3:
						iii.setIii04(data.get(i));
						break;
					case 4:
						iii.setIii05(data.get(i));
						break;
					case 5:
						iii.setIii06(data.get(i));
						break;
					case 6:
						iii.setIii07(data.get(i));
						break;
					case 7:
//						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2115c().get(0)
//								.getIii().setIii09(data.get(i));
						iii.setIii08(data.get(i));
						break;
					case 8:
//						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2115c().get(0)
//								.getIii().setIii09(data.get(i));
						iii.setIii09(data.get(i));
						break;
					 
					 
					}
				}
				Loop2115C loop2115c = new Loop2115C();
				loop2115c.setIii(iii);
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2115c().add(loop2115c);
				break; 
		 
					
		}
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi271;
	}
	public Edi271 mapLoop2120C(Edi271 edi271, int stCounter, int ebCounter, int loopCounter, List<String> data,
			/* List<String> composite, */ String currentSegment) {
		int iterator = 0;

		try {
			switch (currentSegment) { 	
			case "LS":				 
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLs().setLs01(data.get(iterator++));				
				break;
			case "NM1":
				NM1 nm1 = new NM1();
				
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						nm1.setNm101(data.get(i));
						//edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getNm1().setNm101(data.get(i));
						break;
					case 1:
						nm1.setNm102(data.get(i));
						//edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getNm1().setNm102(data.get(i));
						break;
					case 2:
						nm1.setNm103(data.get(i));
						//edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getNm1().setNm103(data.get(i));
						break;
					case 3:
						nm1.setNm104(data.get(i));
						//edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getNm1().setNm104(data.get(i));
						break;
					case 4:
						nm1.setNm105(data.get(i));
						//edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getNm1().setNm105(data.get(i));
						break;
					case 5:
						nm1.setNm106(data.get(i));
						//edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getNm1().setNm106(data.get(i));
						break;
					case 6:
						nm1.setNm107(data.get(i));
						//edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getNm1().setNm107(data.get(i));
						break;
					case 7:
						nm1.setNm108(data.get(i));
						//edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getNm1().setNm108(data.get(i));
						break;
					case 8:						
						nm1.setNm109(data.get(i));
						//edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getNm1().setNm109(data.get(i));
						break;
					case 9:
						nm1.setNm110(data.get(i));
						//edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getNm1().setNm110(data.get(i));
						break;
					case 10:
						nm1.setNm111(data.get(i));
						//edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getNm1().setNm111(data.get(i));
						break;
					case 11:
						nm1.setNm112(data.get(i));
						//edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getNm1().setNm112(data.get(i));
						break;
					}
				}
				
				Loop2120C loop2120c = new Loop2120C();
				loop2120c.setNm1(nm1);
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().add(loop2120c);
				break;
			case "N3":
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getN3().setN301(data.get(i));
						break;
					case 1:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getN3().setN302(data.get(i));
						break;					 
					}
				}
				break;	
			case "N4":
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getN4().setN401(data.get(i));
						break;
					case 1:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getN4().setN402(data.get(i));
						break;
					case 2:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getN4().setN403(data.get(i));
						break;
					case 3:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getN4().setN404(data.get(i));
						break;
					case 4:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getN4().setN405(data.get(i));
						break;
					case 5:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getN4().setN406(data.get(i));
						break;
					case 6:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getN4().setN407(data.get(i));
						break;
						
					}
				}
				break;	
			case "PER": // repeat 3 times
				PER per = new PER();
				for (int i = 0; i < data.size(); i++) {
					switch (i) {
					case 0:
						per.setPer01(data.get(iterator++));
						break;
					case 1:
						per.setPer02(data.get(iterator++));
						break;
					case 2:
						per.setPer03(data.get(iterator++));
						break;
					case 3:
						per.setPer04(data.get(iterator++));
						break;
					case 4:
						per.setPer05(data.get(iterator++));
						break;
					case 5:
						per.setPer06(data.get(iterator++));
						break;
					case 6:
						per.setPer07(data.get(iterator++));
						break;
					case 7:
						per.setPer08(data.get(iterator++));
						break;
					case 8:
						per.setPer09(data.get(iterator++));
						break;
					}
				}	    
				
				edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getPermap().put(loopCounter, per);

				break;
			case "PRV":
				for(int i=0;i<data.size();i++)
				{
					iterator++;
					switch(i) 
					{
					case 0: 				
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getPrv().setPrv01(data.get(i));
					    break;
					case 1:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getPrv().setPrv02(data.get(i));						
					    break;	
					case 2:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getPrv().setPrv03(data.get(i));
						 break;
					case 3:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getPrv().setPrv04(data.get(i));
						 break;
					case 4:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getPrv().setPrv05(data.get(i));
						 break;
					case 5:
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLoop2120c().get(loopCounter).getPrv().setPrv06(data.get(i));
						 break;
					 
					default:
					    break; 
					}
				}
				 
				
				break;
			case "LE":
				 
				for(int i=0;i<data.size();i++)
				{
					iterator++;
					switch(i) 
					{
					case 0: 			
						edi271.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(ebCounter).getLe().setLe01(data.get(i));
						
					    break;
					 
					}
				}
				
				break;
			}
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//			new ApplicationException(ex, env.getProperty("spring.application.name")));
	ex.printStackTrace();
		}

		return edi271;
	}
}
