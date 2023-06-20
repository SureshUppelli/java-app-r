package com.abcbs.benefitsedix12objects.models.response.extstatus;

import java.util.List;
import java.util.Map;

import com.abcbs.benefitsedix12objects.models.EB;

public class Results {
	private String idType;
    private String segment;
    private String overallStatus;
 //   private String ebList;
    private Map<String, String> statusEbList;
  //  private Map<String, List<EB>> statusList;

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(String overallStatus) {
        this.overallStatus = overallStatus;
    }

//	public String getEbList() {
//		return ebList;
//	}
//
//	public void setEbList(String ebList) {
//		this.ebList = ebList;
//	}

	public Map<String, String> getStatusList() {
		return statusEbList;
	}

	public void setStatusEbList(Map<String, String> statusEbList) {
		this.statusEbList = statusEbList;
	}

//    public Map<String, List<EB>> getStatusList() {
//        return statusList;
//    }
//
//    public void setStatusList(Map<String, List<EB>> statusList) {
//        this.statusList = statusList;
//    }
}
