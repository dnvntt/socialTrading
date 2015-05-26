/**
 * MyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class MyInfo  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private java.lang.String country;

    private java.lang.String customerId;

    private java.lang.String email;

    private java.lang.String fax;

    private java.lang.String mobiphone;

    private java.lang.String notificationEmail;

    private java.lang.String province;

    private java.lang.String telephone1;

    private java.lang.String telephone2;

    private java.lang.String mailingAddress;

    public MyInfo() {
    }

    public MyInfo(
           java.lang.String country,
           java.lang.String customerId,
           java.lang.String email,
           java.lang.String fax,
           java.lang.String mobiphone,
           java.lang.String notificationEmail,
           java.lang.String province,
           java.lang.String telephone1,
           java.lang.String telephone2,
           java.lang.String mailingAddress) {
        this.country = country;
        this.customerId = customerId;
        this.email = email;
        this.fax = fax;
        this.mobiphone = mobiphone;
        this.notificationEmail = notificationEmail;
        this.province = province;
        this.telephone1 = telephone1;
        this.telephone2 = telephone2;
        this.mailingAddress = mailingAddress;
    }


    /**
     * Gets the country value for this MyInfo.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this MyInfo.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the customerId value for this MyInfo.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this MyInfo.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the email value for this MyInfo.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this MyInfo.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the fax value for this MyInfo.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this MyInfo.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the mobiphone value for this MyInfo.
     * 
     * @return mobiphone
     */
    public java.lang.String getMobiphone() {
        return mobiphone;
    }


    /**
     * Sets the mobiphone value for this MyInfo.
     * 
     * @param mobiphone
     */
    public void setMobiphone(java.lang.String mobiphone) {
        this.mobiphone = mobiphone;
    }


    /**
     * Gets the notificationEmail value for this MyInfo.
     * 
     * @return notificationEmail
     */
    public java.lang.String getNotificationEmail() {
        return notificationEmail;
    }


    /**
     * Sets the notificationEmail value for this MyInfo.
     * 
     * @param notificationEmail
     */
    public void setNotificationEmail(java.lang.String notificationEmail) {
        this.notificationEmail = notificationEmail;
    }


    /**
     * Gets the province value for this MyInfo.
     * 
     * @return province
     */
    public java.lang.String getProvince() {
        return province;
    }


    /**
     * Sets the province value for this MyInfo.
     * 
     * @param province
     */
    public void setProvince(java.lang.String province) {
        this.province = province;
    }


    /**
     * Gets the telephone1 value for this MyInfo.
     * 
     * @return telephone1
     */
    public java.lang.String getTelephone1() {
        return telephone1;
    }


    /**
     * Sets the telephone1 value for this MyInfo.
     * 
     * @param telephone1
     */
    public void setTelephone1(java.lang.String telephone1) {
        this.telephone1 = telephone1;
    }


    /**
     * Gets the telephone2 value for this MyInfo.
     * 
     * @return telephone2
     */
    public java.lang.String getTelephone2() {
        return telephone2;
    }


    /**
     * Sets the telephone2 value for this MyInfo.
     * 
     * @param telephone2
     */
    public void setTelephone2(java.lang.String telephone2) {
        this.telephone2 = telephone2;
    }


    /**
     * Gets the mailingAddress value for this MyInfo.
     * 
     * @return mailingAddress
     */
    public java.lang.String getMailingAddress() {
        return mailingAddress;
    }


    /**
     * Sets the mailingAddress value for this MyInfo.
     * 
     * @param mailingAddress
     */
    public void setMailingAddress(java.lang.String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MyInfo)) return false;
        MyInfo other = (MyInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.mobiphone==null && other.getMobiphone()==null) || 
             (this.mobiphone!=null &&
              this.mobiphone.equals(other.getMobiphone()))) &&
            ((this.notificationEmail==null && other.getNotificationEmail()==null) || 
             (this.notificationEmail!=null &&
              this.notificationEmail.equals(other.getNotificationEmail()))) &&
            ((this.province==null && other.getProvince()==null) || 
             (this.province!=null &&
              this.province.equals(other.getProvince()))) &&
            ((this.telephone1==null && other.getTelephone1()==null) || 
             (this.telephone1!=null &&
              this.telephone1.equals(other.getTelephone1()))) &&
            ((this.telephone2==null && other.getTelephone2()==null) || 
             (this.telephone2!=null &&
              this.telephone2.equals(other.getTelephone2()))) &&
            ((this.mailingAddress==null && other.getMailingAddress()==null) || 
             (this.mailingAddress!=null &&
              this.mailingAddress.equals(other.getMailingAddress())));
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getMobiphone() != null) {
            _hashCode += getMobiphone().hashCode();
        }
        if (getNotificationEmail() != null) {
            _hashCode += getNotificationEmail().hashCode();
        }
        if (getProvince() != null) {
            _hashCode += getProvince().hashCode();
        }
        if (getTelephone1() != null) {
            _hashCode += getTelephone1().hashCode();
        }
        if (getTelephone2() != null) {
            _hashCode += getTelephone2().hashCode();
        }
        if (getMailingAddress() != null) {
            _hashCode += getMailingAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MyInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "MyInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobiphone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Mobiphone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "NotificationEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("province");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Province"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Telephone1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "Telephone2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "MailingAddress"));
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
