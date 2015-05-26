/**
 * ConfirmTermDeposit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ConfirmTermDeposit  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String acctno;

    private java.lang.String actype;

    private java.lang.String termcd;

    private double TDTerm;

    private java.lang.String autoPaid;

    private double minAmt;

    private java.lang.String schdType;

    private double intRate;

    private java.lang.String autoRnd;

    private java.lang.String inttypbrcd;

    private double flIntRate;

    private java.lang.String buyingPower;

    private double amt;

    private java.util.Calendar frDate;

    private java.util.Calendar toDate;

    private double advIntrest;

    private double amtBuyingPower;

    private java.lang.String isCI;

    private java.lang.String TDSrc;

    private double mstRate;

    private double mstTerm;

    private java.lang.String desc;

    private java.lang.String fullname;

    private java.lang.String address;

    public ConfirmTermDeposit() {
    }

    public ConfirmTermDeposit(
           java.lang.String acctno,
           java.lang.String actype,
           java.lang.String termcd,
           double TDTerm,
           java.lang.String autoPaid,
           double minAmt,
           java.lang.String schdType,
           double intRate,
           java.lang.String autoRnd,
           java.lang.String inttypbrcd,
           double flIntRate,
           java.lang.String buyingPower,
           double amt,
           java.util.Calendar frDate,
           java.util.Calendar toDate,
           double advIntrest,
           double amtBuyingPower,
           java.lang.String isCI,
           java.lang.String TDSrc,
           double mstRate,
           double mstTerm,
           java.lang.String desc,
           java.lang.String fullname,
           java.lang.String address) {
        this.acctno = acctno;
        this.actype = actype;
        this.termcd = termcd;
        this.TDTerm = TDTerm;
        this.autoPaid = autoPaid;
        this.minAmt = minAmt;
        this.schdType = schdType;
        this.intRate = intRate;
        this.autoRnd = autoRnd;
        this.inttypbrcd = inttypbrcd;
        this.flIntRate = flIntRate;
        this.buyingPower = buyingPower;
        this.amt = amt;
        this.frDate = frDate;
        this.toDate = toDate;
        this.advIntrest = advIntrest;
        this.amtBuyingPower = amtBuyingPower;
        this.isCI = isCI;
        this.TDSrc = TDSrc;
        this.mstRate = mstRate;
        this.mstTerm = mstTerm;
        this.desc = desc;
        this.fullname = fullname;
        this.address = address;
    }


    /**
     * Gets the acctno value for this ConfirmTermDeposit.
     * 
     * @return acctno
     */
    public java.lang.String getAcctno() {
        return acctno;
    }


    /**
     * Sets the acctno value for this ConfirmTermDeposit.
     * 
     * @param acctno
     */
    public void setAcctno(java.lang.String acctno) {
        this.acctno = acctno;
    }


    /**
     * Gets the actype value for this ConfirmTermDeposit.
     * 
     * @return actype
     */
    public java.lang.String getActype() {
        return actype;
    }


    /**
     * Sets the actype value for this ConfirmTermDeposit.
     * 
     * @param actype
     */
    public void setActype(java.lang.String actype) {
        this.actype = actype;
    }


    /**
     * Gets the termcd value for this ConfirmTermDeposit.
     * 
     * @return termcd
     */
    public java.lang.String getTermcd() {
        return termcd;
    }


    /**
     * Sets the termcd value for this ConfirmTermDeposit.
     * 
     * @param termcd
     */
    public void setTermcd(java.lang.String termcd) {
        this.termcd = termcd;
    }


    /**
     * Gets the TDTerm value for this ConfirmTermDeposit.
     * 
     * @return TDTerm
     */
    public double getTDTerm() {
        return TDTerm;
    }


    /**
     * Sets the TDTerm value for this ConfirmTermDeposit.
     * 
     * @param TDTerm
     */
    public void setTDTerm(double TDTerm) {
        this.TDTerm = TDTerm;
    }


    /**
     * Gets the autoPaid value for this ConfirmTermDeposit.
     * 
     * @return autoPaid
     */
    public java.lang.String getAutoPaid() {
        return autoPaid;
    }


    /**
     * Sets the autoPaid value for this ConfirmTermDeposit.
     * 
     * @param autoPaid
     */
    public void setAutoPaid(java.lang.String autoPaid) {
        this.autoPaid = autoPaid;
    }


    /**
     * Gets the minAmt value for this ConfirmTermDeposit.
     * 
     * @return minAmt
     */
    public double getMinAmt() {
        return minAmt;
    }


    /**
     * Sets the minAmt value for this ConfirmTermDeposit.
     * 
     * @param minAmt
     */
    public void setMinAmt(double minAmt) {
        this.minAmt = minAmt;
    }


    /**
     * Gets the schdType value for this ConfirmTermDeposit.
     * 
     * @return schdType
     */
    public java.lang.String getSchdType() {
        return schdType;
    }


    /**
     * Sets the schdType value for this ConfirmTermDeposit.
     * 
     * @param schdType
     */
    public void setSchdType(java.lang.String schdType) {
        this.schdType = schdType;
    }


    /**
     * Gets the intRate value for this ConfirmTermDeposit.
     * 
     * @return intRate
     */
    public double getIntRate() {
        return intRate;
    }


    /**
     * Sets the intRate value for this ConfirmTermDeposit.
     * 
     * @param intRate
     */
    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }


    /**
     * Gets the autoRnd value for this ConfirmTermDeposit.
     * 
     * @return autoRnd
     */
    public java.lang.String getAutoRnd() {
        return autoRnd;
    }


    /**
     * Sets the autoRnd value for this ConfirmTermDeposit.
     * 
     * @param autoRnd
     */
    public void setAutoRnd(java.lang.String autoRnd) {
        this.autoRnd = autoRnd;
    }


    /**
     * Gets the inttypbrcd value for this ConfirmTermDeposit.
     * 
     * @return inttypbrcd
     */
    public java.lang.String getInttypbrcd() {
        return inttypbrcd;
    }


    /**
     * Sets the inttypbrcd value for this ConfirmTermDeposit.
     * 
     * @param inttypbrcd
     */
    public void setInttypbrcd(java.lang.String inttypbrcd) {
        this.inttypbrcd = inttypbrcd;
    }


    /**
     * Gets the flIntRate value for this ConfirmTermDeposit.
     * 
     * @return flIntRate
     */
    public double getFlIntRate() {
        return flIntRate;
    }


    /**
     * Sets the flIntRate value for this ConfirmTermDeposit.
     * 
     * @param flIntRate
     */
    public void setFlIntRate(double flIntRate) {
        this.flIntRate = flIntRate;
    }


    /**
     * Gets the buyingPower value for this ConfirmTermDeposit.
     * 
     * @return buyingPower
     */
    public java.lang.String getBuyingPower() {
        return buyingPower;
    }


    /**
     * Sets the buyingPower value for this ConfirmTermDeposit.
     * 
     * @param buyingPower
     */
    public void setBuyingPower(java.lang.String buyingPower) {
        this.buyingPower = buyingPower;
    }


    /**
     * Gets the amt value for this ConfirmTermDeposit.
     * 
     * @return amt
     */
    public double getAmt() {
        return amt;
    }


    /**
     * Sets the amt value for this ConfirmTermDeposit.
     * 
     * @param amt
     */
    public void setAmt(double amt) {
        this.amt = amt;
    }


    /**
     * Gets the frDate value for this ConfirmTermDeposit.
     * 
     * @return frDate
     */
    public java.util.Calendar getFrDate() {
        return frDate;
    }


    /**
     * Sets the frDate value for this ConfirmTermDeposit.
     * 
     * @param frDate
     */
    public void setFrDate(java.util.Calendar frDate) {
        this.frDate = frDate;
    }


    /**
     * Gets the toDate value for this ConfirmTermDeposit.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this ConfirmTermDeposit.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the advIntrest value for this ConfirmTermDeposit.
     * 
     * @return advIntrest
     */
    public double getAdvIntrest() {
        return advIntrest;
    }


    /**
     * Sets the advIntrest value for this ConfirmTermDeposit.
     * 
     * @param advIntrest
     */
    public void setAdvIntrest(double advIntrest) {
        this.advIntrest = advIntrest;
    }


    /**
     * Gets the amtBuyingPower value for this ConfirmTermDeposit.
     * 
     * @return amtBuyingPower
     */
    public double getAmtBuyingPower() {
        return amtBuyingPower;
    }


    /**
     * Sets the amtBuyingPower value for this ConfirmTermDeposit.
     * 
     * @param amtBuyingPower
     */
    public void setAmtBuyingPower(double amtBuyingPower) {
        this.amtBuyingPower = amtBuyingPower;
    }


    /**
     * Gets the isCI value for this ConfirmTermDeposit.
     * 
     * @return isCI
     */
    public java.lang.String getIsCI() {
        return isCI;
    }


    /**
     * Sets the isCI value for this ConfirmTermDeposit.
     * 
     * @param isCI
     */
    public void setIsCI(java.lang.String isCI) {
        this.isCI = isCI;
    }


    /**
     * Gets the TDSrc value for this ConfirmTermDeposit.
     * 
     * @return TDSrc
     */
    public java.lang.String getTDSrc() {
        return TDSrc;
    }


    /**
     * Sets the TDSrc value for this ConfirmTermDeposit.
     * 
     * @param TDSrc
     */
    public void setTDSrc(java.lang.String TDSrc) {
        this.TDSrc = TDSrc;
    }


    /**
     * Gets the mstRate value for this ConfirmTermDeposit.
     * 
     * @return mstRate
     */
    public double getMstRate() {
        return mstRate;
    }


    /**
     * Sets the mstRate value for this ConfirmTermDeposit.
     * 
     * @param mstRate
     */
    public void setMstRate(double mstRate) {
        this.mstRate = mstRate;
    }


    /**
     * Gets the mstTerm value for this ConfirmTermDeposit.
     * 
     * @return mstTerm
     */
    public double getMstTerm() {
        return mstTerm;
    }


    /**
     * Sets the mstTerm value for this ConfirmTermDeposit.
     * 
     * @param mstTerm
     */
    public void setMstTerm(double mstTerm) {
        this.mstTerm = mstTerm;
    }


    /**
     * Gets the desc value for this ConfirmTermDeposit.
     * 
     * @return desc
     */
    public java.lang.String getDesc() {
        return desc;
    }


    /**
     * Sets the desc value for this ConfirmTermDeposit.
     * 
     * @param desc
     */
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }


    /**
     * Gets the fullname value for this ConfirmTermDeposit.
     * 
     * @return fullname
     */
    public java.lang.String getFullname() {
        return fullname;
    }


    /**
     * Sets the fullname value for this ConfirmTermDeposit.
     * 
     * @param fullname
     */
    public void setFullname(java.lang.String fullname) {
        this.fullname = fullname;
    }


    /**
     * Gets the address value for this ConfirmTermDeposit.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this ConfirmTermDeposit.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfirmTermDeposit)) return false;
        ConfirmTermDeposit other = (ConfirmTermDeposit) obj;
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
            ((this.actype==null && other.getActype()==null) || 
             (this.actype!=null &&
              this.actype.equals(other.getActype()))) &&
            ((this.termcd==null && other.getTermcd()==null) || 
             (this.termcd!=null &&
              this.termcd.equals(other.getTermcd()))) &&
            this.TDTerm == other.getTDTerm() &&
            ((this.autoPaid==null && other.getAutoPaid()==null) || 
             (this.autoPaid!=null &&
              this.autoPaid.equals(other.getAutoPaid()))) &&
            this.minAmt == other.getMinAmt() &&
            ((this.schdType==null && other.getSchdType()==null) || 
             (this.schdType!=null &&
              this.schdType.equals(other.getSchdType()))) &&
            this.intRate == other.getIntRate() &&
            ((this.autoRnd==null && other.getAutoRnd()==null) || 
             (this.autoRnd!=null &&
              this.autoRnd.equals(other.getAutoRnd()))) &&
            ((this.inttypbrcd==null && other.getInttypbrcd()==null) || 
             (this.inttypbrcd!=null &&
              this.inttypbrcd.equals(other.getInttypbrcd()))) &&
            this.flIntRate == other.getFlIntRate() &&
            ((this.buyingPower==null && other.getBuyingPower()==null) || 
             (this.buyingPower!=null &&
              this.buyingPower.equals(other.getBuyingPower()))) &&
            this.amt == other.getAmt() &&
            ((this.frDate==null && other.getFrDate()==null) || 
             (this.frDate!=null &&
              this.frDate.equals(other.getFrDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            this.advIntrest == other.getAdvIntrest() &&
            this.amtBuyingPower == other.getAmtBuyingPower() &&
            ((this.isCI==null && other.getIsCI()==null) || 
             (this.isCI!=null &&
              this.isCI.equals(other.getIsCI()))) &&
            ((this.TDSrc==null && other.getTDSrc()==null) || 
             (this.TDSrc!=null &&
              this.TDSrc.equals(other.getTDSrc()))) &&
            this.mstRate == other.getMstRate() &&
            this.mstTerm == other.getMstTerm() &&
            ((this.desc==null && other.getDesc()==null) || 
             (this.desc!=null &&
              this.desc.equals(other.getDesc()))) &&
            ((this.fullname==null && other.getFullname()==null) || 
             (this.fullname!=null &&
              this.fullname.equals(other.getFullname()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getActype() != null) {
            _hashCode += getActype().hashCode();
        }
        if (getTermcd() != null) {
            _hashCode += getTermcd().hashCode();
        }
        _hashCode += new Double(getTDTerm()).hashCode();
        if (getAutoPaid() != null) {
            _hashCode += getAutoPaid().hashCode();
        }
        _hashCode += new Double(getMinAmt()).hashCode();
        if (getSchdType() != null) {
            _hashCode += getSchdType().hashCode();
        }
        _hashCode += new Double(getIntRate()).hashCode();
        if (getAutoRnd() != null) {
            _hashCode += getAutoRnd().hashCode();
        }
        if (getInttypbrcd() != null) {
            _hashCode += getInttypbrcd().hashCode();
        }
        _hashCode += new Double(getFlIntRate()).hashCode();
        if (getBuyingPower() != null) {
            _hashCode += getBuyingPower().hashCode();
        }
        _hashCode += new Double(getAmt()).hashCode();
        if (getFrDate() != null) {
            _hashCode += getFrDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        _hashCode += new Double(getAdvIntrest()).hashCode();
        _hashCode += new Double(getAmtBuyingPower()).hashCode();
        if (getIsCI() != null) {
            _hashCode += getIsCI().hashCode();
        }
        if (getTDSrc() != null) {
            _hashCode += getTDSrc().hashCode();
        }
        _hashCode += new Double(getMstRate()).hashCode();
        _hashCode += new Double(getMstTerm()).hashCode();
        if (getDesc() != null) {
            _hashCode += getDesc().hashCode();
        }
        if (getFullname() != null) {
            _hashCode += getFullname().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmTermDeposit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "ConfirmTermDeposit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Acctno"));
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
        elemField.setFieldName("termcd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Termcd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TDTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TDTerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AutoPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MinAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("intRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "IntRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoRnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AutoRnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inttypbrcd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Inttypbrcd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flIntRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "FlIntRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingPower");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "BuyingPower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Amt"));
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
        elemField.setFieldName("advIntrest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AdvIntrest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amtBuyingPower");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AmtBuyingPower"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "IsCI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TDSrc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "TDSrc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mstRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MstRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mstTerm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MstTerm"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Fullname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Address"));
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
