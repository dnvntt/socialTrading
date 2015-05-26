/**
 * TDTransaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class TDTransaction  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.util.Calendar TXDATE;

    private java.util.Calendar FRDATE;

    private java.util.Calendar TODATE;

    private java.lang.String ACCTNO;

    private java.lang.String ACTYPE;

    private java.lang.String TLTXCD;

    private java.lang.String TRANSACTIONTYPE;

    private double AMT;

    private double WITHDRAWALAMT;

    private double INTRATE;

    private double ADVINTRATE;

    private double ADVINTAMT;

    private double PAIDINTAMT;

    private java.lang.String STATUS;

    private java.lang.String VIA;

    private double TDTERM;

    public TDTransaction() {
    }

    public TDTransaction(
           java.util.Calendar TXDATE,
           java.util.Calendar FRDATE,
           java.util.Calendar TODATE,
           java.lang.String ACCTNO,
           java.lang.String ACTYPE,
           java.lang.String TLTXCD,
           java.lang.String TRANSACTIONTYPE,
           double AMT,
           double WITHDRAWALAMT,
           double INTRATE,
           double ADVINTRATE,
           double ADVINTAMT,
           double PAIDINTAMT,
           java.lang.String STATUS,
           java.lang.String VIA,
           double TDTERM) {
        this.TXDATE = TXDATE;
        this.FRDATE = FRDATE;
        this.TODATE = TODATE;
        this.ACCTNO = ACCTNO;
        this.ACTYPE = ACTYPE;
        this.TLTXCD = TLTXCD;
        this.TRANSACTIONTYPE = TRANSACTIONTYPE;
        this.AMT = AMT;
        this.WITHDRAWALAMT = WITHDRAWALAMT;
        this.INTRATE = INTRATE;
        this.ADVINTRATE = ADVINTRATE;
        this.ADVINTAMT = ADVINTAMT;
        this.PAIDINTAMT = PAIDINTAMT;
        this.STATUS = STATUS;
        this.VIA = VIA;
        this.TDTERM = TDTERM;
    }


    /**
     * Gets the TXDATE value for this TDTransaction.
     * 
     * @return TXDATE
     */
    public java.util.Calendar getTXDATE() {
        return TXDATE;
    }


    /**
     * Sets the TXDATE value for this TDTransaction.
     * 
     * @param TXDATE
     */
    public void setTXDATE(java.util.Calendar TXDATE) {
        this.TXDATE = TXDATE;
    }


    /**
     * Gets the FRDATE value for this TDTransaction.
     * 
     * @return FRDATE
     */
    public java.util.Calendar getFRDATE() {
        return FRDATE;
    }


    /**
     * Sets the FRDATE value for this TDTransaction.
     * 
     * @param FRDATE
     */
    public void setFRDATE(java.util.Calendar FRDATE) {
        this.FRDATE = FRDATE;
    }


    /**
     * Gets the TODATE value for this TDTransaction.
     * 
     * @return TODATE
     */
    public java.util.Calendar getTODATE() {
        return TODATE;
    }


    /**
     * Sets the TODATE value for this TDTransaction.
     * 
     * @param TODATE
     */
    public void setTODATE(java.util.Calendar TODATE) {
        this.TODATE = TODATE;
    }


    /**
     * Gets the ACCTNO value for this TDTransaction.
     * 
     * @return ACCTNO
     */
    public java.lang.String getACCTNO() {
        return ACCTNO;
    }


    /**
     * Sets the ACCTNO value for this TDTransaction.
     * 
     * @param ACCTNO
     */
    public void setACCTNO(java.lang.String ACCTNO) {
        this.ACCTNO = ACCTNO;
    }


    /**
     * Gets the ACTYPE value for this TDTransaction.
     * 
     * @return ACTYPE
     */
    public java.lang.String getACTYPE() {
        return ACTYPE;
    }


    /**
     * Sets the ACTYPE value for this TDTransaction.
     * 
     * @param ACTYPE
     */
    public void setACTYPE(java.lang.String ACTYPE) {
        this.ACTYPE = ACTYPE;
    }


    /**
     * Gets the TLTXCD value for this TDTransaction.
     * 
     * @return TLTXCD
     */
    public java.lang.String getTLTXCD() {
        return TLTXCD;
    }


    /**
     * Sets the TLTXCD value for this TDTransaction.
     * 
     * @param TLTXCD
     */
    public void setTLTXCD(java.lang.String TLTXCD) {
        this.TLTXCD = TLTXCD;
    }


    /**
     * Gets the TRANSACTIONTYPE value for this TDTransaction.
     * 
     * @return TRANSACTIONTYPE
     */
    public java.lang.String getTRANSACTIONTYPE() {
        return TRANSACTIONTYPE;
    }


    /**
     * Sets the TRANSACTIONTYPE value for this TDTransaction.
     * 
     * @param TRANSACTIONTYPE
     */
    public void setTRANSACTIONTYPE(java.lang.String TRANSACTIONTYPE) {
        this.TRANSACTIONTYPE = TRANSACTIONTYPE;
    }


    /**
     * Gets the AMT value for this TDTransaction.
     * 
     * @return AMT
     */
    public double getAMT() {
        return AMT;
    }


    /**
     * Sets the AMT value for this TDTransaction.
     * 
     * @param AMT
     */
    public void setAMT(double AMT) {
        this.AMT = AMT;
    }


    /**
     * Gets the WITHDRAWALAMT value for this TDTransaction.
     * 
     * @return WITHDRAWALAMT
     */
    public double getWITHDRAWALAMT() {
        return WITHDRAWALAMT;
    }


    /**
     * Sets the WITHDRAWALAMT value for this TDTransaction.
     * 
     * @param WITHDRAWALAMT
     */
    public void setWITHDRAWALAMT(double WITHDRAWALAMT) {
        this.WITHDRAWALAMT = WITHDRAWALAMT;
    }


    /**
     * Gets the INTRATE value for this TDTransaction.
     * 
     * @return INTRATE
     */
    public double getINTRATE() {
        return INTRATE;
    }


    /**
     * Sets the INTRATE value for this TDTransaction.
     * 
     * @param INTRATE
     */
    public void setINTRATE(double INTRATE) {
        this.INTRATE = INTRATE;
    }


    /**
     * Gets the ADVINTRATE value for this TDTransaction.
     * 
     * @return ADVINTRATE
     */
    public double getADVINTRATE() {
        return ADVINTRATE;
    }


    /**
     * Sets the ADVINTRATE value for this TDTransaction.
     * 
     * @param ADVINTRATE
     */
    public void setADVINTRATE(double ADVINTRATE) {
        this.ADVINTRATE = ADVINTRATE;
    }


    /**
     * Gets the ADVINTAMT value for this TDTransaction.
     * 
     * @return ADVINTAMT
     */
    public double getADVINTAMT() {
        return ADVINTAMT;
    }


    /**
     * Sets the ADVINTAMT value for this TDTransaction.
     * 
     * @param ADVINTAMT
     */
    public void setADVINTAMT(double ADVINTAMT) {
        this.ADVINTAMT = ADVINTAMT;
    }


    /**
     * Gets the PAIDINTAMT value for this TDTransaction.
     * 
     * @return PAIDINTAMT
     */
    public double getPAIDINTAMT() {
        return PAIDINTAMT;
    }


    /**
     * Sets the PAIDINTAMT value for this TDTransaction.
     * 
     * @param PAIDINTAMT
     */
    public void setPAIDINTAMT(double PAIDINTAMT) {
        this.PAIDINTAMT = PAIDINTAMT;
    }


    /**
     * Gets the STATUS value for this TDTransaction.
     * 
     * @return STATUS
     */
    public java.lang.String getSTATUS() {
        return STATUS;
    }


    /**
     * Sets the STATUS value for this TDTransaction.
     * 
     * @param STATUS
     */
    public void setSTATUS(java.lang.String STATUS) {
        this.STATUS = STATUS;
    }


    /**
     * Gets the VIA value for this TDTransaction.
     * 
     * @return VIA
     */
    public java.lang.String getVIA() {
        return VIA;
    }


    /**
     * Sets the VIA value for this TDTransaction.
     * 
     * @param VIA
     */
    public void setVIA(java.lang.String VIA) {
        this.VIA = VIA;
    }


    /**
     * Gets the TDTERM value for this TDTransaction.
     * 
     * @return TDTERM
     */
    public double getTDTERM() {
        return TDTERM;
    }


    /**
     * Sets the TDTERM value for this TDTransaction.
     * 
     * @param TDTERM
     */
    public void setTDTERM(double TDTERM) {
        this.TDTERM = TDTERM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TDTransaction)) return false;
        TDTransaction other = (TDTransaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.TXDATE==null && other.getTXDATE()==null) || 
             (this.TXDATE!=null &&
              this.TXDATE.equals(other.getTXDATE()))) &&
            ((this.FRDATE==null && other.getFRDATE()==null) || 
             (this.FRDATE!=null &&
              this.FRDATE.equals(other.getFRDATE()))) &&
            ((this.TODATE==null && other.getTODATE()==null) || 
             (this.TODATE!=null &&
              this.TODATE.equals(other.getTODATE()))) &&
            ((this.ACCTNO==null && other.getACCTNO()==null) || 
             (this.ACCTNO!=null &&
              this.ACCTNO.equals(other.getACCTNO()))) &&
            ((this.ACTYPE==null && other.getACTYPE()==null) || 
             (this.ACTYPE!=null &&
              this.ACTYPE.equals(other.getACTYPE()))) &&
            ((this.TLTXCD==null && other.getTLTXCD()==null) || 
             (this.TLTXCD!=null &&
              this.TLTXCD.equals(other.getTLTXCD()))) &&
            ((this.TRANSACTIONTYPE==null && other.getTRANSACTIONTYPE()==null) || 
             (this.TRANSACTIONTYPE!=null &&
              this.TRANSACTIONTYPE.equals(other.getTRANSACTIONTYPE()))) &&
            this.AMT == other.getAMT() &&
            this.WITHDRAWALAMT == other.getWITHDRAWALAMT() &&
            this.INTRATE == other.getINTRATE() &&
            this.ADVINTRATE == other.getADVINTRATE() &&
            this.ADVINTAMT == other.getADVINTAMT() &&
            this.PAIDINTAMT == other.getPAIDINTAMT() &&
            ((this.STATUS==null && other.getSTATUS()==null) || 
             (this.STATUS!=null &&
              this.STATUS.equals(other.getSTATUS()))) &&
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
        if (getTXDATE() != null) {
            _hashCode += getTXDATE().hashCode();
        }
        if (getFRDATE() != null) {
            _hashCode += getFRDATE().hashCode();
        }
        if (getTODATE() != null) {
            _hashCode += getTODATE().hashCode();
        }
        if (getACCTNO() != null) {
            _hashCode += getACCTNO().hashCode();
        }
        if (getACTYPE() != null) {
            _hashCode += getACTYPE().hashCode();
        }
        if (getTLTXCD() != null) {
            _hashCode += getTLTXCD().hashCode();
        }
        if (getTRANSACTIONTYPE() != null) {
            _hashCode += getTRANSACTIONTYPE().hashCode();
        }
        _hashCode += new Double(getAMT()).hashCode();
        _hashCode += new Double(getWITHDRAWALAMT()).hashCode();
        _hashCode += new Double(getINTRATE()).hashCode();
        _hashCode += new Double(getADVINTRATE()).hashCode();
        _hashCode += new Double(getADVINTAMT()).hashCode();
        _hashCode += new Double(getPAIDINTAMT()).hashCode();
        if (getSTATUS() != null) {
            _hashCode += getSTATUS().hashCode();
        }
        if (getVIA() != null) {
            _hashCode += getVIA().hashCode();
        }
        _hashCode += new Double(getTDTERM()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TDTransaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "TDTransaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("TLTXCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TLTXCD"));
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
        elemField.setFieldName("AMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WITHDRAWALAMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "WITHDRAWALAMT"));
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
        elemField.setFieldName("ADVINTAMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ADVINTAMT"));
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
        elemField.setFieldName("STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "STATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
