/**
 * TDTransactionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class TDTransactionDetail  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private double STT;

    private java.lang.String ACCTNO;

    private java.lang.String ACTYPE;

    private java.util.Calendar TXDATE;

    private java.util.Calendar FRDATE;

    private java.util.Calendar TODATE;

    private double ORGAMT;

    private java.lang.String TLTXCD;

    private java.lang.String SCHDTYPE;

    private java.lang.String TRANSACTIONTYPE;

    private double WITHDRAWALAMT;

    private double PAIDAMT;

    private double INTRATE;

    private double ADVINTRATE;

    private double ADVINTAAMT;

    private double PAIDINTAMT;

    private double PPAMT;

    private double BALANCE;

    private java.lang.String VIA;

    private double TDTERM;

    public TDTransactionDetail() {
    }

    public TDTransactionDetail(
           double STT,
           java.lang.String ACCTNO,
           java.lang.String ACTYPE,
           java.util.Calendar TXDATE,
           java.util.Calendar FRDATE,
           java.util.Calendar TODATE,
           double ORGAMT,
           java.lang.String TLTXCD,
           java.lang.String SCHDTYPE,
           java.lang.String TRANSACTIONTYPE,
           double WITHDRAWALAMT,
           double PAIDAMT,
           double INTRATE,
           double ADVINTRATE,
           double ADVINTAAMT,
           double PAIDINTAMT,
           double PPAMT,
           double BALANCE,
           java.lang.String VIA,
           double TDTERM) {
        this.STT = STT;
        this.ACCTNO = ACCTNO;
        this.ACTYPE = ACTYPE;
        this.TXDATE = TXDATE;
        this.FRDATE = FRDATE;
        this.TODATE = TODATE;
        this.ORGAMT = ORGAMT;
        this.TLTXCD = TLTXCD;
        this.SCHDTYPE = SCHDTYPE;
        this.TRANSACTIONTYPE = TRANSACTIONTYPE;
        this.WITHDRAWALAMT = WITHDRAWALAMT;
        this.PAIDAMT = PAIDAMT;
        this.INTRATE = INTRATE;
        this.ADVINTRATE = ADVINTRATE;
        this.ADVINTAAMT = ADVINTAAMT;
        this.PAIDINTAMT = PAIDINTAMT;
        this.PPAMT = PPAMT;
        this.BALANCE = BALANCE;
        this.VIA = VIA;
        this.TDTERM = TDTERM;
    }


    /**
     * Gets the STT value for this TDTransactionDetail.
     * 
     * @return STT
     */
    public double getSTT() {
        return STT;
    }


    /**
     * Sets the STT value for this TDTransactionDetail.
     * 
     * @param STT
     */
    public void setSTT(double STT) {
        this.STT = STT;
    }


    /**
     * Gets the ACCTNO value for this TDTransactionDetail.
     * 
     * @return ACCTNO
     */
    public java.lang.String getACCTNO() {
        return ACCTNO;
    }


    /**
     * Sets the ACCTNO value for this TDTransactionDetail.
     * 
     * @param ACCTNO
     */
    public void setACCTNO(java.lang.String ACCTNO) {
        this.ACCTNO = ACCTNO;
    }


    /**
     * Gets the ACTYPE value for this TDTransactionDetail.
     * 
     * @return ACTYPE
     */
    public java.lang.String getACTYPE() {
        return ACTYPE;
    }


    /**
     * Sets the ACTYPE value for this TDTransactionDetail.
     * 
     * @param ACTYPE
     */
    public void setACTYPE(java.lang.String ACTYPE) {
        this.ACTYPE = ACTYPE;
    }


    /**
     * Gets the TXDATE value for this TDTransactionDetail.
     * 
     * @return TXDATE
     */
    public java.util.Calendar getTXDATE() {
        return TXDATE;
    }


    /**
     * Sets the TXDATE value for this TDTransactionDetail.
     * 
     * @param TXDATE
     */
    public void setTXDATE(java.util.Calendar TXDATE) {
        this.TXDATE = TXDATE;
    }


    /**
     * Gets the FRDATE value for this TDTransactionDetail.
     * 
     * @return FRDATE
     */
    public java.util.Calendar getFRDATE() {
        return FRDATE;
    }


    /**
     * Sets the FRDATE value for this TDTransactionDetail.
     * 
     * @param FRDATE
     */
    public void setFRDATE(java.util.Calendar FRDATE) {
        this.FRDATE = FRDATE;
    }


    /**
     * Gets the TODATE value for this TDTransactionDetail.
     * 
     * @return TODATE
     */
    public java.util.Calendar getTODATE() {
        return TODATE;
    }


    /**
     * Sets the TODATE value for this TDTransactionDetail.
     * 
     * @param TODATE
     */
    public void setTODATE(java.util.Calendar TODATE) {
        this.TODATE = TODATE;
    }


    /**
     * Gets the ORGAMT value for this TDTransactionDetail.
     * 
     * @return ORGAMT
     */
    public double getORGAMT() {
        return ORGAMT;
    }


    /**
     * Sets the ORGAMT value for this TDTransactionDetail.
     * 
     * @param ORGAMT
     */
    public void setORGAMT(double ORGAMT) {
        this.ORGAMT = ORGAMT;
    }


    /**
     * Gets the TLTXCD value for this TDTransactionDetail.
     * 
     * @return TLTXCD
     */
    public java.lang.String getTLTXCD() {
        return TLTXCD;
    }


    /**
     * Sets the TLTXCD value for this TDTransactionDetail.
     * 
     * @param TLTXCD
     */
    public void setTLTXCD(java.lang.String TLTXCD) {
        this.TLTXCD = TLTXCD;
    }


    /**
     * Gets the SCHDTYPE value for this TDTransactionDetail.
     * 
     * @return SCHDTYPE
     */
    public java.lang.String getSCHDTYPE() {
        return SCHDTYPE;
    }


    /**
     * Sets the SCHDTYPE value for this TDTransactionDetail.
     * 
     * @param SCHDTYPE
     */
    public void setSCHDTYPE(java.lang.String SCHDTYPE) {
        this.SCHDTYPE = SCHDTYPE;
    }


    /**
     * Gets the TRANSACTIONTYPE value for this TDTransactionDetail.
     * 
     * @return TRANSACTIONTYPE
     */
    public java.lang.String getTRANSACTIONTYPE() {
        return TRANSACTIONTYPE;
    }


    /**
     * Sets the TRANSACTIONTYPE value for this TDTransactionDetail.
     * 
     * @param TRANSACTIONTYPE
     */
    public void setTRANSACTIONTYPE(java.lang.String TRANSACTIONTYPE) {
        this.TRANSACTIONTYPE = TRANSACTIONTYPE;
    }


    /**
     * Gets the WITHDRAWALAMT value for this TDTransactionDetail.
     * 
     * @return WITHDRAWALAMT
     */
    public double getWITHDRAWALAMT() {
        return WITHDRAWALAMT;
    }


    /**
     * Sets the WITHDRAWALAMT value for this TDTransactionDetail.
     * 
     * @param WITHDRAWALAMT
     */
    public void setWITHDRAWALAMT(double WITHDRAWALAMT) {
        this.WITHDRAWALAMT = WITHDRAWALAMT;
    }


    /**
     * Gets the PAIDAMT value for this TDTransactionDetail.
     * 
     * @return PAIDAMT
     */
    public double getPAIDAMT() {
        return PAIDAMT;
    }


    /**
     * Sets the PAIDAMT value for this TDTransactionDetail.
     * 
     * @param PAIDAMT
     */
    public void setPAIDAMT(double PAIDAMT) {
        this.PAIDAMT = PAIDAMT;
    }


    /**
     * Gets the INTRATE value for this TDTransactionDetail.
     * 
     * @return INTRATE
     */
    public double getINTRATE() {
        return INTRATE;
    }


    /**
     * Sets the INTRATE value for this TDTransactionDetail.
     * 
     * @param INTRATE
     */
    public void setINTRATE(double INTRATE) {
        this.INTRATE = INTRATE;
    }


    /**
     * Gets the ADVINTRATE value for this TDTransactionDetail.
     * 
     * @return ADVINTRATE
     */
    public double getADVINTRATE() {
        return ADVINTRATE;
    }


    /**
     * Sets the ADVINTRATE value for this TDTransactionDetail.
     * 
     * @param ADVINTRATE
     */
    public void setADVINTRATE(double ADVINTRATE) {
        this.ADVINTRATE = ADVINTRATE;
    }


    /**
     * Gets the ADVINTAAMT value for this TDTransactionDetail.
     * 
     * @return ADVINTAAMT
     */
    public double getADVINTAAMT() {
        return ADVINTAAMT;
    }


    /**
     * Sets the ADVINTAAMT value for this TDTransactionDetail.
     * 
     * @param ADVINTAAMT
     */
    public void setADVINTAAMT(double ADVINTAAMT) {
        this.ADVINTAAMT = ADVINTAAMT;
    }


    /**
     * Gets the PAIDINTAMT value for this TDTransactionDetail.
     * 
     * @return PAIDINTAMT
     */
    public double getPAIDINTAMT() {
        return PAIDINTAMT;
    }


    /**
     * Sets the PAIDINTAMT value for this TDTransactionDetail.
     * 
     * @param PAIDINTAMT
     */
    public void setPAIDINTAMT(double PAIDINTAMT) {
        this.PAIDINTAMT = PAIDINTAMT;
    }


    /**
     * Gets the PPAMT value for this TDTransactionDetail.
     * 
     * @return PPAMT
     */
    public double getPPAMT() {
        return PPAMT;
    }


    /**
     * Sets the PPAMT value for this TDTransactionDetail.
     * 
     * @param PPAMT
     */
    public void setPPAMT(double PPAMT) {
        this.PPAMT = PPAMT;
    }


    /**
     * Gets the BALANCE value for this TDTransactionDetail.
     * 
     * @return BALANCE
     */
    public double getBALANCE() {
        return BALANCE;
    }


    /**
     * Sets the BALANCE value for this TDTransactionDetail.
     * 
     * @param BALANCE
     */
    public void setBALANCE(double BALANCE) {
        this.BALANCE = BALANCE;
    }


    /**
     * Gets the VIA value for this TDTransactionDetail.
     * 
     * @return VIA
     */
    public java.lang.String getVIA() {
        return VIA;
    }


    /**
     * Sets the VIA value for this TDTransactionDetail.
     * 
     * @param VIA
     */
    public void setVIA(java.lang.String VIA) {
        this.VIA = VIA;
    }


    /**
     * Gets the TDTERM value for this TDTransactionDetail.
     * 
     * @return TDTERM
     */
    public double getTDTERM() {
        return TDTERM;
    }


    /**
     * Sets the TDTERM value for this TDTransactionDetail.
     * 
     * @param TDTERM
     */
    public void setTDTERM(double TDTERM) {
        this.TDTERM = TDTERM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TDTransactionDetail)) return false;
        TDTransactionDetail other = (TDTransactionDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.STT == other.getSTT() &&
            ((this.ACCTNO==null && other.getACCTNO()==null) || 
             (this.ACCTNO!=null &&
              this.ACCTNO.equals(other.getACCTNO()))) &&
            ((this.ACTYPE==null && other.getACTYPE()==null) || 
             (this.ACTYPE!=null &&
              this.ACTYPE.equals(other.getACTYPE()))) &&
            ((this.TXDATE==null && other.getTXDATE()==null) || 
             (this.TXDATE!=null &&
              this.TXDATE.equals(other.getTXDATE()))) &&
            ((this.FRDATE==null && other.getFRDATE()==null) || 
             (this.FRDATE!=null &&
              this.FRDATE.equals(other.getFRDATE()))) &&
            ((this.TODATE==null && other.getTODATE()==null) || 
             (this.TODATE!=null &&
              this.TODATE.equals(other.getTODATE()))) &&
            this.ORGAMT == other.getORGAMT() &&
            ((this.TLTXCD==null && other.getTLTXCD()==null) || 
             (this.TLTXCD!=null &&
              this.TLTXCD.equals(other.getTLTXCD()))) &&
            ((this.SCHDTYPE==null && other.getSCHDTYPE()==null) || 
             (this.SCHDTYPE!=null &&
              this.SCHDTYPE.equals(other.getSCHDTYPE()))) &&
            ((this.TRANSACTIONTYPE==null && other.getTRANSACTIONTYPE()==null) || 
             (this.TRANSACTIONTYPE!=null &&
              this.TRANSACTIONTYPE.equals(other.getTRANSACTIONTYPE()))) &&
            this.WITHDRAWALAMT == other.getWITHDRAWALAMT() &&
            this.PAIDAMT == other.getPAIDAMT() &&
            this.INTRATE == other.getINTRATE() &&
            this.ADVINTRATE == other.getADVINTRATE() &&
            this.ADVINTAAMT == other.getADVINTAAMT() &&
            this.PAIDINTAMT == other.getPAIDINTAMT() &&
            this.PPAMT == other.getPPAMT() &&
            this.BALANCE == other.getBALANCE() &&
            ((this.VIA==null && other.getVIA()==null) || 
             (this.VIA!=null &&
              this.VIA.equals(other.getVIA()))) &&
            this.TDTERM == other.getTDTERM();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += new Double(getSTT()).hashCode();
        if (getACCTNO() != null) {
            _hashCode += getACCTNO().hashCode();
        }
        if (getACTYPE() != null) {
            _hashCode += getACTYPE().hashCode();
        }
        if (getTXDATE() != null) {
            _hashCode += getTXDATE().hashCode();
        }
        if (getFRDATE() != null) {
            _hashCode += getFRDATE().hashCode();
        }
        if (getTODATE() != null) {
            _hashCode += getTODATE().hashCode();
        }
        _hashCode += new Double(getORGAMT()).hashCode();
        if (getTLTXCD() != null) {
            _hashCode += getTLTXCD().hashCode();
        }
        if (getSCHDTYPE() != null) {
            _hashCode += getSCHDTYPE().hashCode();
        }
        if (getTRANSACTIONTYPE() != null) {
            _hashCode += getTRANSACTIONTYPE().hashCode();
        }
        _hashCode += new Double(getWITHDRAWALAMT()).hashCode();
        _hashCode += new Double(getPAIDAMT()).hashCode();
        _hashCode += new Double(getINTRATE()).hashCode();
        _hashCode += new Double(getADVINTRATE()).hashCode();
        _hashCode += new Double(getADVINTAAMT()).hashCode();
        _hashCode += new Double(getPAIDINTAMT()).hashCode();
        _hashCode += new Double(getPPAMT()).hashCode();
        _hashCode += new Double(getBALANCE()).hashCode();
        if (getVIA() != null) {
            _hashCode += getVIA().hashCode();
        }
        _hashCode += new Double(getTDTERM()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TDTransactionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "TDTransactionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "STT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCTNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ACCTNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ACTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TXDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TXDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FRDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FRDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TODATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TODATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORGAMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ORGAMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TLTXCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TLTXCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCHDTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "SCHDTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TRANSACTIONTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TRANSACTIONTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WITHDRAWALAMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "WITHDRAWALAMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAIDAMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "PAIDAMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INTRATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "INTRATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADVINTRATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ADVINTRATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADVINTAAMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ADVINTAAMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAIDINTAMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "PAIDINTAMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPAMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "PPAMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BALANCE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "BALANCE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VIA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "VIA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TDTERM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TDTERM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
