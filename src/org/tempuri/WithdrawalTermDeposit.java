/**
 * WithdrawalTermDeposit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class WithdrawalTermDeposit  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String acctno;

    private java.lang.String afacctno;

    private java.lang.String actype;

    private java.lang.String schdType;

    private double balance;

    private java.util.Calendar frDate;

    private java.util.Calendar toDate;

    private double intRate;

    private double orgAmt;

    private double advRateIntrest;

    private double amtIntrest;

    private double dateIntrest;

    private double amt;

    private java.lang.String desc;

    public WithdrawalTermDeposit() {
    }

    public WithdrawalTermDeposit(
           java.lang.String acctno,
           java.lang.String afacctno,
           java.lang.String actype,
           java.lang.String schdType,
           double balance,
           java.util.Calendar frDate,
           java.util.Calendar toDate,
           double intRate,
           double orgAmt,
           double advRateIntrest,
           double amtIntrest,
           double dateIntrest,
           double amt,
           java.lang.String desc) {
        this.acctno = acctno;
        this.afacctno = afacctno;
        this.actype = actype;
        this.schdType = schdType;
        this.balance = balance;
        this.frDate = frDate;
        this.toDate = toDate;
        this.intRate = intRate;
        this.orgAmt = orgAmt;
        this.advRateIntrest = advRateIntrest;
        this.amtIntrest = amtIntrest;
        this.dateIntrest = dateIntrest;
        this.amt = amt;
        this.desc = desc;
    }


    /**
     * Gets the acctno value for this WithdrawalTermDeposit.
     * 
     * @return acctno
     */
    public java.lang.String getAcctno() {
        return acctno;
    }


    /**
     * Sets the acctno value for this WithdrawalTermDeposit.
     * 
     * @param acctno
     */
    public void setAcctno(java.lang.String acctno) {
        this.acctno = acctno;
    }


    /**
     * Gets the afacctno value for this WithdrawalTermDeposit.
     * 
     * @return afacctno
     */
    public java.lang.String getAfacctno() {
        return afacctno;
    }


    /**
     * Sets the afacctno value for this WithdrawalTermDeposit.
     * 
     * @param afacctno
     */
    public void setAfacctno(java.lang.String afacctno) {
        this.afacctno = afacctno;
    }


    /**
     * Gets the actype value for this WithdrawalTermDeposit.
     * 
     * @return actype
     */
    public java.lang.String getActype() {
        return actype;
    }


    /**
     * Sets the actype value for this WithdrawalTermDeposit.
     * 
     * @param actype
     */
    public void setActype(java.lang.String actype) {
        this.actype = actype;
    }


    /**
     * Gets the schdType value for this WithdrawalTermDeposit.
     * 
     * @return schdType
     */
    public java.lang.String getSchdType() {
        return schdType;
    }


    /**
     * Sets the schdType value for this WithdrawalTermDeposit.
     * 
     * @param schdType
     */
    public void setSchdType(java.lang.String schdType) {
        this.schdType = schdType;
    }


    /**
     * Gets the balance value for this WithdrawalTermDeposit.
     * 
     * @return balance
     */
    public double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this WithdrawalTermDeposit.
     * 
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }


    /**
     * Gets the frDate value for this WithdrawalTermDeposit.
     * 
     * @return frDate
     */
    public java.util.Calendar getFrDate() {
        return frDate;
    }


    /**
     * Sets the frDate value for this WithdrawalTermDeposit.
     * 
     * @param frDate
     */
    public void setFrDate(java.util.Calendar frDate) {
        this.frDate = frDate;
    }


    /**
     * Gets the toDate value for this WithdrawalTermDeposit.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this WithdrawalTermDeposit.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the intRate value for this WithdrawalTermDeposit.
     * 
     * @return intRate
     */
    public double getIntRate() {
        return intRate;
    }


    /**
     * Sets the intRate value for this WithdrawalTermDeposit.
     * 
     * @param intRate
     */
    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }


    /**
     * Gets the orgAmt value for this WithdrawalTermDeposit.
     * 
     * @return orgAmt
     */
    public double getOrgAmt() {
        return orgAmt;
    }


    /**
     * Sets the orgAmt value for this WithdrawalTermDeposit.
     * 
     * @param orgAmt
     */
    public void setOrgAmt(double orgAmt) {
        this.orgAmt = orgAmt;
    }


    /**
     * Gets the advRateIntrest value for this WithdrawalTermDeposit.
     * 
     * @return advRateIntrest
     */
    public double getAdvRateIntrest() {
        return advRateIntrest;
    }


    /**
     * Sets the advRateIntrest value for this WithdrawalTermDeposit.
     * 
     * @param advRateIntrest
     */
    public void setAdvRateIntrest(double advRateIntrest) {
        this.advRateIntrest = advRateIntrest;
    }


    /**
     * Gets the amtIntrest value for this WithdrawalTermDeposit.
     * 
     * @return amtIntrest
     */
    public double getAmtIntrest() {
        return amtIntrest;
    }


    /**
     * Sets the amtIntrest value for this WithdrawalTermDeposit.
     * 
     * @param amtIntrest
     */
    public void setAmtIntrest(double amtIntrest) {
        this.amtIntrest = amtIntrest;
    }


    /**
     * Gets the dateIntrest value for this WithdrawalTermDeposit.
     * 
     * @return dateIntrest
     */
    public double getDateIntrest() {
        return dateIntrest;
    }


    /**
     * Sets the dateIntrest value for this WithdrawalTermDeposit.
     * 
     * @param dateIntrest
     */
    public void setDateIntrest(double dateIntrest) {
        this.dateIntrest = dateIntrest;
    }


    /**
     * Gets the amt value for this WithdrawalTermDeposit.
     * 
     * @return amt
     */
    public double getAmt() {
        return amt;
    }


    /**
     * Sets the amt value for this WithdrawalTermDeposit.
     * 
     * @param amt
     */
    public void setAmt(double amt) {
        this.amt = amt;
    }


    /**
     * Gets the desc value for this WithdrawalTermDeposit.
     * 
     * @return desc
     */
    public java.lang.String getDesc() {
        return desc;
    }


    /**
     * Sets the desc value for this WithdrawalTermDeposit.
     * 
     * @param desc
     */
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WithdrawalTermDeposit)) return false;
        WithdrawalTermDeposit other = (WithdrawalTermDeposit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acctno==null && other.getAcctno()==null) || 
             (this.acctno!=null &&
              this.acctno.equals(other.getAcctno()))) &&
            ((this.afacctno==null && other.getAfacctno()==null) || 
             (this.afacctno!=null &&
              this.afacctno.equals(other.getAfacctno()))) &&
            ((this.actype==null && other.getActype()==null) || 
             (this.actype!=null &&
              this.actype.equals(other.getActype()))) &&
            ((this.schdType==null && other.getSchdType()==null) || 
             (this.schdType!=null &&
              this.schdType.equals(other.getSchdType()))) &&
            this.balance == other.getBalance() &&
            ((this.frDate==null && other.getFrDate()==null) || 
             (this.frDate!=null &&
              this.frDate.equals(other.getFrDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            this.intRate == other.getIntRate() &&
            this.orgAmt == other.getOrgAmt() &&
            this.advRateIntrest == other.getAdvRateIntrest() &&
            this.amtIntrest == other.getAmtIntrest() &&
            this.dateIntrest == other.getDateIntrest() &&
            this.amt == other.getAmt() &&
            ((this.desc==null && other.getDesc()==null) || 
             (this.desc!=null &&
              this.desc.equals(other.getDesc())));
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
        if (getAcctno() != null) {
            _hashCode += getAcctno().hashCode();
        }
        if (getAfacctno() != null) {
            _hashCode += getAfacctno().hashCode();
        }
        if (getActype() != null) {
            _hashCode += getActype().hashCode();
        }
        if (getSchdType() != null) {
            _hashCode += getSchdType().hashCode();
        }
        _hashCode += new Double(getBalance()).hashCode();
        if (getFrDate() != null) {
            _hashCode += getFrDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        _hashCode += new Double(getIntRate()).hashCode();
        _hashCode += new Double(getOrgAmt()).hashCode();
        _hashCode += new Double(getAdvRateIntrest()).hashCode();
        _hashCode += new Double(getAmtIntrest()).hashCode();
        _hashCode += new Double(getDateIntrest()).hashCode();
        _hashCode += new Double(getAmt()).hashCode();
        if (getDesc() != null) {
            _hashCode += getDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WithdrawalTermDeposit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "WithdrawalTermDeposit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Acctno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afacctno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Afacctno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Actype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "SchdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FrDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "ToDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "IntRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "OrgAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advRateIntrest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AdvRateIntrest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amtIntrest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AmtIntrest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateIntrest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "DateIntrest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Amt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
