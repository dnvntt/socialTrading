/**
 * TdMast.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class TdMast  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String ACCTNO;

    private java.lang.String ACTYPE;

    private java.lang.String SCHDTYPE;

    private double ORGAMT;

    private java.util.Calendar FRDATE;

    private java.util.Calendar TODATE;

    private double INTENDAMT;

    private double INTAVLAMT;

    private double WITHDRAWAL;

    private double BALANCE;

    private double ADVINTRATE;

    private double INTRATE;

    private double TDTERM;

    public TdMast() {
    }

    public TdMast(
           java.lang.String ACCTNO,
           java.lang.String ACTYPE,
           java.lang.String SCHDTYPE,
           double ORGAMT,
           java.util.Calendar FRDATE,
           java.util.Calendar TODATE,
           double INTENDAMT,
           double INTAVLAMT,
           double WITHDRAWAL,
           double BALANCE,
           double ADVINTRATE,
           double INTRATE,
           double TDTERM) {
        this.ACCTNO = ACCTNO;
        this.ACTYPE = ACTYPE;
        this.SCHDTYPE = SCHDTYPE;
        this.ORGAMT = ORGAMT;
        this.FRDATE = FRDATE;
        this.TODATE = TODATE;
        this.INTENDAMT = INTENDAMT;
        this.INTAVLAMT = INTAVLAMT;
        this.WITHDRAWAL = WITHDRAWAL;
        this.BALANCE = BALANCE;
        this.ADVINTRATE = ADVINTRATE;
        this.INTRATE = INTRATE;
        this.TDTERM = TDTERM;
    }


    /**
     * Gets the ACCTNO value for this TdMast.
     * 
     * @return ACCTNO
     */
    public java.lang.String getACCTNO() {
        return ACCTNO;
    }


    /**
     * Sets the ACCTNO value for this TdMast.
     * 
     * @param ACCTNO
     */
    public void setACCTNO(java.lang.String ACCTNO) {
        this.ACCTNO = ACCTNO;
    }


    /**
     * Gets the ACTYPE value for this TdMast.
     * 
     * @return ACTYPE
     */
    public java.lang.String getACTYPE() {
        return ACTYPE;
    }


    /**
     * Sets the ACTYPE value for this TdMast.
     * 
     * @param ACTYPE
     */
    public void setACTYPE(java.lang.String ACTYPE) {
        this.ACTYPE = ACTYPE;
    }


    /**
     * Gets the SCHDTYPE value for this TdMast.
     * 
     * @return SCHDTYPE
     */
    public java.lang.String getSCHDTYPE() {
        return SCHDTYPE;
    }


    /**
     * Sets the SCHDTYPE value for this TdMast.
     * 
     * @param SCHDTYPE
     */
    public void setSCHDTYPE(java.lang.String SCHDTYPE) {
        this.SCHDTYPE = SCHDTYPE;
    }


    /**
     * Gets the ORGAMT value for this TdMast.
     * 
     * @return ORGAMT
     */
    public double getORGAMT() {
        return ORGAMT;
    }


    /**
     * Sets the ORGAMT value for this TdMast.
     * 
     * @param ORGAMT
     */
    public void setORGAMT(double ORGAMT) {
        this.ORGAMT = ORGAMT;
    }


    /**
     * Gets the FRDATE value for this TdMast.
     * 
     * @return FRDATE
     */
    public java.util.Calendar getFRDATE() {
        return FRDATE;
    }


    /**
     * Sets the FRDATE value for this TdMast.
     * 
     * @param FRDATE
     */
    public void setFRDATE(java.util.Calendar FRDATE) {
        this.FRDATE = FRDATE;
    }


    /**
     * Gets the TODATE value for this TdMast.
     * 
     * @return TODATE
     */
    public java.util.Calendar getTODATE() {
        return TODATE;
    }


    /**
     * Sets the TODATE value for this TdMast.
     * 
     * @param TODATE
     */
    public void setTODATE(java.util.Calendar TODATE) {
        this.TODATE = TODATE;
    }


    /**
     * Gets the INTENDAMT value for this TdMast.
     * 
     * @return INTENDAMT
     */
    public double getINTENDAMT() {
        return INTENDAMT;
    }


    /**
     * Sets the INTENDAMT value for this TdMast.
     * 
     * @param INTENDAMT
     */
    public void setINTENDAMT(double INTENDAMT) {
        this.INTENDAMT = INTENDAMT;
    }


    /**
     * Gets the INTAVLAMT value for this TdMast.
     * 
     * @return INTAVLAMT
     */
    public double getINTAVLAMT() {
        return INTAVLAMT;
    }


    /**
     * Sets the INTAVLAMT value for this TdMast.
     * 
     * @param INTAVLAMT
     */
    public void setINTAVLAMT(double INTAVLAMT) {
        this.INTAVLAMT = INTAVLAMT;
    }


    /**
     * Gets the WITHDRAWAL value for this TdMast.
     * 
     * @return WITHDRAWAL
     */
    public double getWITHDRAWAL() {
        return WITHDRAWAL;
    }


    /**
     * Sets the WITHDRAWAL value for this TdMast.
     * 
     * @param WITHDRAWAL
     */
    public void setWITHDRAWAL(double WITHDRAWAL) {
        this.WITHDRAWAL = WITHDRAWAL;
    }


    /**
     * Gets the BALANCE value for this TdMast.
     * 
     * @return BALANCE
     */
    public double getBALANCE() {
        return BALANCE;
    }


    /**
     * Sets the BALANCE value for this TdMast.
     * 
     * @param BALANCE
     */
    public void setBALANCE(double BALANCE) {
        this.BALANCE = BALANCE;
    }


    /**
     * Gets the ADVINTRATE value for this TdMast.
     * 
     * @return ADVINTRATE
     */
    public double getADVINTRATE() {
        return ADVINTRATE;
    }


    /**
     * Sets the ADVINTRATE value for this TdMast.
     * 
     * @param ADVINTRATE
     */
    public void setADVINTRATE(double ADVINTRATE) {
        this.ADVINTRATE = ADVINTRATE;
    }


    /**
     * Gets the INTRATE value for this TdMast.
     * 
     * @return INTRATE
     */
    public double getINTRATE() {
        return INTRATE;
    }


    /**
     * Sets the INTRATE value for this TdMast.
     * 
     * @param INTRATE
     */
    public void setINTRATE(double INTRATE) {
        this.INTRATE = INTRATE;
    }


    /**
     * Gets the TDTERM value for this TdMast.
     * 
     * @return TDTERM
     */
    public double getTDTERM() {
        return TDTERM;
    }


    /**
     * Sets the TDTERM value for this TdMast.
     * 
     * @param TDTERM
     */
    public void setTDTERM(double TDTERM) {
        this.TDTERM = TDTERM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TdMast)) return false;
        TdMast other = (TdMast) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ACCTNO==null && other.getACCTNO()==null) || 
             (this.ACCTNO!=null &&
              this.ACCTNO.equals(other.getACCTNO()))) &&
            ((this.ACTYPE==null && other.getACTYPE()==null) || 
             (this.ACTYPE!=null &&
              this.ACTYPE.equals(other.getACTYPE()))) &&
            ((this.SCHDTYPE==null && other.getSCHDTYPE()==null) || 
             (this.SCHDTYPE!=null &&
              this.SCHDTYPE.equals(other.getSCHDTYPE()))) &&
            this.ORGAMT == other.getORGAMT() &&
            ((this.FRDATE==null && other.getFRDATE()==null) || 
             (this.FRDATE!=null &&
              this.FRDATE.equals(other.getFRDATE()))) &&
            ((this.TODATE==null && other.getTODATE()==null) || 
             (this.TODATE!=null &&
              this.TODATE.equals(other.getTODATE()))) &&
            this.INTENDAMT == other.getINTENDAMT() &&
            this.INTAVLAMT == other.getINTAVLAMT() &&
            this.WITHDRAWAL == other.getWITHDRAWAL() &&
            this.BALANCE == other.getBALANCE() &&
            this.ADVINTRATE == other.getADVINTRATE() &&
            this.INTRATE == other.getINTRATE() &&
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
        if (getACCTNO() != null) {
            _hashCode += getACCTNO().hashCode();
        }
        if (getACTYPE() != null) {
            _hashCode += getACTYPE().hashCode();
        }
        if (getSCHDTYPE() != null) {
            _hashCode += getSCHDTYPE().hashCode();
        }
        _hashCode += new Double(getORGAMT()).hashCode();
        if (getFRDATE() != null) {
            _hashCode += getFRDATE().hashCode();
        }
        if (getTODATE() != null) {
            _hashCode += getTODATE().hashCode();
        }
        _hashCode += new Double(getINTENDAMT()).hashCode();
        _hashCode += new Double(getINTAVLAMT()).hashCode();
        _hashCode += new Double(getWITHDRAWAL()).hashCode();
        _hashCode += new Double(getBALANCE()).hashCode();
        _hashCode += new Double(getADVINTRATE()).hashCode();
        _hashCode += new Double(getINTRATE()).hashCode();
        _hashCode += new Double(getTDTERM()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TdMast.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "TdMast"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("SCHDTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "SCHDTYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORGAMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ORGAMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("INTENDAMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "INTENDAMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INTAVLAMT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "INTAVLAMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WITHDRAWAL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "WITHDRAWAL"));
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
        elemField.setFieldName("ADVINTRATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ADVINTRATE"));
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
