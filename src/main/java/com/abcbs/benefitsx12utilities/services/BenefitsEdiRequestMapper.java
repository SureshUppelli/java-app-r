package com.abcbs.benefitsx12utilities.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.abcbs.benefitsedix12objects.models.DTP;
import com.abcbs.benefitsedix12objects.models.EQ;
import com.abcbs.benefitsedix12objects.models.Edi270;
import com.abcbs.benefitsedix12objects.models.HI;
import com.abcbs.benefitsedix12objects.models.REF;
import com.abcbs.benefitsedix12objects.models.TRN;
import com.abcbs.benefitsedix12objects.models.request.Loop2110C;
import com.abcbs.benefitsedix12objects.models.request.ST;



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
public class BenefitsEdiRequestMapper {

	@Autowired
	private Environment env;

	public Edi270 mapIsa(Edi270 edi, List<String> data) {

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
//					new ApplicationException(ex, env.getProperty("spring.application.name")));
			ex.printStackTrace();
		}

		return edi;
	}

	public Edi270 mapGs(Edi270 edi, List<String> data) {
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
//					new ApplicationException(ex, env.getProperty("spring.application.name")));
			ex.printStackTrace();
		}

		return edi;
	}

	public Edi270 mapGe(Edi270 edi, List<String> data) {
		int iterator = 0;

		try {
			edi.getGe().setGe01(data.get(iterator++));
			edi.getGe().setGe02(data.get(iterator++));
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//					new ApplicationException(ex, env.getProperty("spring.application.name")));
			ex.printStackTrace();
		}

		return edi;
	}

	public Edi270 mapSe(Edi270 edi, int stCounter, List<String> data) {
		int iterator = 0;

		try {
			edi.getStlist().get(stCounter).getSe().setSe01(data.get(iterator++));
			edi.getStlist().get(stCounter).getSe().setSe02(data.get(iterator++));
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//					new ApplicationException(ex, env.getProperty("spring.application.name")));
			ex.printStackTrace();
		}

		return edi;
	}

	public Edi270 mapIea(Edi270 edi, List<String> data) {
		int iterator = 0;

		try {
			edi.getIea().setIea01(data.get(iterator++));
			edi.getIea().setIea02(data.get(iterator++));
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//					new ApplicationException(ex, env.getProperty("spring.application.name")));
			ex.printStackTrace();
		}

		return edi;
	}

	public ST mapSt(ST st, List<String> data) {
		int iterator = 0;

		try {
			st.setSt01(data.get(iterator++));
			st.setSt02(data.get(iterator++));
			st.setSt03(data.get(iterator++));
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//					new ApplicationException(ex, env.getProperty("spring.application.name")));
			ex.printStackTrace();
		}

		return st;
	}

	public Edi270 mapBht(Edi270 edi, int stCounter, List<String> data) {
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
//					new ApplicationException(ex, env.getProperty("spring.application.name")));
			ex.printStackTrace();
		}

		return edi;
	}

	
	public Edi270 mapLoop2000A(Edi270 edi270, int stCounter, List<String> data, String currentSegment) {
		int iterator = 0;

		try {
			switch (currentSegment) {
			case "HL":
				edi270.getStlist().get(stCounter).getLoop2000a().getHl().setHl01(data.get(iterator++));
				/*
				 * No hierarchical parent exists yet so HL02 value will be empty
				 */
				edi270.getStlist().get(stCounter).getLoop2000a().getHl().setHl02(data.get(iterator++));
				edi270.getStlist().get(stCounter).getLoop2000a().getHl().setHl03(data.get(iterator++));
				edi270.getStlist().get(stCounter).getLoop2000a().getHl().setHl04(data.get(iterator++));
				break;
			case "NM1":
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						edi270.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm101(data.get(i));
						break;
					case 1:
						edi270.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm102(data.get(i));
						break;
					case 2:
						edi270.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm103(data.get(i));
						break;
					case 3:
						edi270.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm104(data.get(i));
						break;
					case 4:
						edi270.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm105(data.get(i));
						break;
					case 5:
						edi270.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm106(data.get(i));
						break;
					case 6:
						edi270.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm107(data.get(i));
						break;
					case 7:
						edi270.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm108(data.get(i));
						break;
					case 8:
						edi270.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm109(data.get(i));
						break;
					case 9:
						edi270.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm110(data.get(i));
						break;
					case 10:
						edi270.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm111(data.get(i));
						break;
					case 11:
						edi270.getStlist().get(stCounter).getLoop2000a().getLoop2100a().getNm1().setNm112(data.get(i));
						break;
					}
				}
				break; 
				 
			
			}
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//					new ApplicationException(ex, env.getProperty("spring.application.name")));
			ex.printStackTrace();
		}

		return edi270;
	}
	public Edi270 mapLoop2000B(Edi270 edi270, int stCounter, List<String> data, String currentSegment,int loopCounter ) {
		int iterator = 0;

		try {
			switch (currentSegment) {
			case "HL":
				edi270.getStlist().get(stCounter).getLoop2000b().getHl().setHl01(data.get(iterator++));
				edi270.getStlist().get(stCounter).getLoop2000b().getHl().setHl02(data.get(iterator++));
				edi270.getStlist().get(stCounter).getLoop2000b().getHl().setHl03(data.get(iterator++));
				edi270.getStlist().get(stCounter).getLoop2000b().getHl().setHl04(data.get(iterator++));
				break;
			case "NM1":
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm101(data.get(i));
						break;
					case 1:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm102(data.get(i));
						break;
					case 2:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm103(data.get(i));
						break;
					case 3:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm104(data.get(i));
						break;
					case 4:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm105(data.get(i));
						break;
					case 5:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm106(data.get(i));
						break;
					case 6:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm107(data.get(i));
						break;
					case 7:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm108(data.get(i));
						break;
					case 8:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm109(data.get(i));
						break;
					case 9:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm110(data.get(i));
						break;
					case 10:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm111(data.get(i));
						break;
					case 11:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getNm1().setNm112(data.get(i));
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
				edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getRefmap().put(loopCounter, ref);
				
				break;
			case "N3":
				//int i = data.size();
				for(int i=0;i<data.size();i++)
				{
					iterator++;
					switch(i) 
					{
					case 0: 				
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN3().setN301(data.get(i));
					    break;
					case 1:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN3().setN302(data.get(i));
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
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN4().setN401(data.get(i));
					    break;
					case 1:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN4().setN402(data.get(i));						
					    break;	
					case 2:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN4().setN402(data.get(i));
						 break;
					case 3:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN4().setN403(data.get(i));
						 break;
					case 4:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN4().setN404(data.get(i));
						 break;
					case 5:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN4().setN405(data.get(i));
						 break;
					case 6:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN4().setN406(data.get(i));
						 break;
					case 7:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getN4().setN407(data.get(i));
						 break;
					default:
					    break; 
					}
				}
				 break;
			
			 
			case "PRV":
				for(int i=0;i<data.size();i++)
				{
					iterator++;
					switch(i) 
					{
					case 0: 				
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getPrv().setPrv01(data.get(i));
					    break;
					case 1:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getPrv().setPrv02(data.get(i));						
					    break;	
					case 2:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getPrv().setPrv03(data.get(i));
						 break;
					case 3:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getPrv().setPrv04(data.get(i));
						 break;
					case 4:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getPrv().setPrv05(data.get(i));
						 break;
					case 5:
						edi270.getStlist().get(stCounter).getLoop2000b().getLoop2100b().getPrv().setPrv06(data.get(i));
						 break;
					 
					default:
					    break; 
					}
				}
				 
				
				break;
				
			}
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//					new ApplicationException(ex, env.getProperty("spring.application.name")));
			ex.printStackTrace();
		}

		return edi270;
	}
	 
	public Edi270 mapLoop2000C(Edi270 edi270, int stCounter, String currentSegment,int loopCounter, List<String> data,List<ArrayList<String> > aList) {
		int iterator = 0;

		try {
			switch (currentSegment) {
			case "HL":
				edi270.getStlist().get(stCounter).getLoop2000c().getHl().setHl01(data.get(iterator++));
				edi270.getStlist().get(stCounter).getLoop2000c().getHl().setHl02(data.get(iterator++));
				edi270.getStlist().get(stCounter).getLoop2000c().getHl().setHl03(data.get(iterator++));
				edi270.getStlist().get(stCounter).getLoop2000c().getHl().setHl04(data.get(iterator++));
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
				edi270.getStlist().get(stCounter).getLoop2000c().getTrnmap().put(loopCounter, trn);
				break;
					
			case "NM1":
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm101(data.get(i));
						break;
					case 1:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm102(data.get(i));
						break;
					case 2:						
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm103(data.get(i));
						break;
					case 3:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm104(data.get(i));
						break;
					case 4:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm105(data.get(i));
						break;
					case 5:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm106(data.get(i));
						break;
					case 6:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm107(data.get(i));
						break;
					case 7:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm108(data.get(i));
						break;
					case 8:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm109(data.get(i));
						break;
					case 9:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm110(data.get(i));
						break;
					case 10:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm111(data.get(i));
						break;
					case 11:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getNm1().setNm112(data.get(i));

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
				   edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getRefmap().put(i, ref);
				break;
			case "N3":
				//int i = data.size();
				for(int i=0;i<data.size();i++)
				{
					iterator++;
					switch(i) 
					{
					case 0: 				
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN3().setN301(data.get(i));
					    break;
					case 1:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN3().setN302(data.get(i));
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
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN401(data.get(i));
					    break;
					case 1:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN402(data.get(i));						
					    break;	
					case 2:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN402(data.get(i));
						 break;
					case 3:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN403(data.get(i));
						 break;
					case 4:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN404(data.get(i));
						 break;
					case 5:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN405(data.get(i));
						 break;
					case 6:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN406(data.get(i));
						 break;
					case 7:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getN4().setN407(data.get(i));
						 break;
					default:
					    break; 
					}
				}
				 break;
			
			 
			case "PRV":
				for(int i=0;i<data.size();i++)
				{
					iterator++;
					switch(i) 
					{
					case 0: 				
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getPrv().setPrv01(data.get(i));
					    break;
					case 1:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getPrv().setPrv02(data.get(i));						
					    break;	
					case 2:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getPrv().setPrv03(data.get(i));
						 break;
					case 3:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getPrv().setPrv04(data.get(i));
						 break;
					case 4:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getPrv().setPrv05(data.get(i));
						 break;
					case 5:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getPrv().setPrv06(data.get(i));
						 break;
					 
					default:
					    break; 
					}
				}
				 
				
				break;
			case "DMG":
				edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg01(data.get(iterator++));
				edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg02(data.get(iterator++));
				/*
				 * DMG03 is situational in this loop and may or may not be empty
				 */
				if (iterator < data.size())
					edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg03(data.get(iterator++));
				/*
				 * DMG04 - DMG11 are not used in this loop and will be empty
				 */
				edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg04("");
				edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg05("");
				edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg06("");
				edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg07("");
				edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg08("");
				edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg09("");
				edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg10("");
				edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDmg().setDmg11("");
				break;
			case "INS":
				for(int i=0;i<data.size();i++)
				{
					iterator++;
					switch(i) 
					{
					case 0: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns01(data.get(i));
						break;
					case 1:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns02(data.get(i));
						break;
					case 2: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns03(data.get(i));
						break;
					case 3: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns04(data.get(i));
						break;
					case 4: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns05(data.get(i));
						break;
					case 5: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns06(data.get(i));
						break;
					case 6: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns07(data.get(i));
						break;
					case 7: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns08(data.get(i));
						break;
					case 8: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns09(data.get(i));
						break;
					case 9: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns10(data.get(i));
						break;
					case 10: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns11(data.get(i));
						break;
					case 11: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns12(data.get(i));
						break;
					case 12: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns13(data.get(i));
						break;
					case 13: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns14(data.get(i));
						break;
					case 14: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns15(data.get(i));
						break;
					case 15: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns16(data.get(i));
						break;
					case 16: 
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getIns().setIns17(data.get(i));
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
				
		        edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().setHi(hi);
				
			
				break;
			case "DTP":
			
				DTP dtp = new DTP();
				dtp.setDtp01(data.get(iterator++));
				dtp.setDtp02(data.get(iterator++));
				dtp.setDtp03(data.get(iterator++));
				
				edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDtpmap().put(loopCounter, dtp);
			
				break;	
			
			}
			
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//					new ApplicationException(ex, env.getProperty("spring.application.name")));
			ex.printStackTrace();
		}

		return edi270;
	}

	 

	public Edi270 mapLoop2110C(Edi270 edi270, int stCounter, int eqcounter,int loopCounter, List<String> data,
			/*List<String> composite,*/  List<ArrayList<String> > aList, String currentSegment) {
		int iterator = 0;

		try {
			switch (currentSegment) {
			case "EQ":
				EQ eq = new EQ();

				// eq01 can be repeatable but not composite
		
 
				for (int i = 0; i < data.size(); i++) {
					switch (iterator) {
					case 0:
						
						for (int k = 0; k <= loopCounter; k++) {
							eq.getEq01().put((k), data.get(i));
							i++;
						}
						if (loopCounter > -1)
						   i--; //decrease only when repeatable data exist
						iterator++;
						break;
					case 1:
						//complete all composites EQ02 and EQ05 here only as we get the data in list of arralists
						for (int k = 0; k < aList.size(); k++) {
							for (int j = 0; j < aList.get(k).size(); j++) {
								switch (k) {
									case 0:
										eq.getEq02().put((j), aList.get(k).get(j));
										break;
									case 1:
										eq.getEq05().put((j), aList.get(k).get(j));  // as per Santhi, EQ05 not supported. 
										break;
								}
							}
						}
						iterator++;
						i--; //decrease it because composite does not use data from  List<String> data
						break;
					case 2:
						eq.setEq03(data.get(i)); // as per Santhi, EQ03 not supported
						iterator++;
						break;
					case 3:
						eq.setEq04(data.get(i)); // as per Santhi, EQ04 not supported
						iterator++;
						break;
//					case 4: 	// as per Santhi, EQ05 not supported. 
//						
						//break;
					default:
						break;
					}
				}
				
				Loop2110C loop2110c = new Loop2110C();
				loop2110c.setEq(eq);
				edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().add(loop2110c);

				break;
			case "AMT":
				for(int k=0;k<data.size();k++)
				{
					iterator++;
					switch(k) 
					{
					case 0: 	
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(eqcounter).getAmt()
						  .setAmt01(data.get(k));
						break;
					case 1: 	
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(eqcounter).getAmt()
						 	.setAmt02(data.get(k));
						break;
					case 3:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(eqcounter).getAmt()
							.setAmt03(data.get(k));
						break;
					default:
							break;
					}
				}
				break;	 
			case "III":
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(eqcounter)
								.getIii().setIii01(data.get(i));
						break;
					case 1:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(eqcounter)
								.getIii().setIii02(data.get(i));
						break;
					case 2:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(eqcounter)
								.getIii().setIii04(data.get(i));
						break;
					case 3:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(eqcounter)
								.getIii().setIii05(data.get(i));
						break;
					case 4:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(eqcounter)
								.getIii().setIii06(data.get(i));
						break;
					case 5:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(eqcounter)
								.getIii().setIii07(data.get(i));
						break;
					case 6:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(eqcounter)
								.getIii().setIii08(data.get(i));
						break;
					case 7:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(eqcounter)
								.getIii().setIii09(data.get(i));
						break;
					default:
						break;
					}
				}
				break;
			case "REF":
					REF ref = new REF();
					ref.setRef01(data.get(iterator++));
					ref.setRef02(data.get(iterator++));
					edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(eqcounter)
							.setRef(ref);
					break;
				 
			case "DTP":
				for (int i = 0; i < data.size(); i++) {
					iterator++;
					switch (i) {
					case 0:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(eqcounter)
						              .getDtp().setDtp01(data.get(i));
						break;
					case 1:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(eqcounter)
								.getDtp().setDtp02(data.get(i));
						break;
					case 2:
						edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getLoop2110c().get(eqcounter)
								.getDtp().setDtp03(data.get(i));
						break;
						
//					DTP dtp = new DTP();
//					dtp.setDtp01(data.get(iterator++));
//					dtp.setDtp02(data.get(iterator++));
//					dtp.setDtp03(data.get(iterator++));
//							 
//					edi270.getStlist().get(stCounter).getLoop2000c().getLoop2100c().getDtpmap().put(0, dtp);
				 
					}
				}
					
		}
		} catch (Exception ex) {
//			CustomExceptionHandler.handleApplicationException(
//					new ApplicationException(ex, env.getProperty("spring.application.name")));
			ex.printStackTrace();
		}

		return edi270;
	}
	
}
