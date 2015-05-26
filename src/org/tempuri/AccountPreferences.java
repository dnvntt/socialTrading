/**
 * AccountPreferences.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AccountPreferences  extends org.tempuri.BaseEntity  implements java.io.Serializable {
    private org.tempuri.Account accountInfo;

    private org.tempuri.Employment employmentInfo;

    private org.tempuri.AccountFeatures accountFeaturesInfo;

    public AccountPreferences() {
    }

    public AccountPreferences(
           org.tempuri.Account accountInfo,
           org.tempuri.Employment employmentInfo,
           org.tempuri.AccountFeatures accountFeaturesInfo) {
        this.accountInfo = accountInfo;
        this.employmentInfo = employmentInfo;
        this.accountFeaturesInfo = accountFeaturesInfo;
    }


    /**
     * Gets the accountInfo value for this AccountPreferences.
     * 
     * @return accountInfo
     */
    public org.tempuri.Account getAccountInfo() {
        return accountInfo;
    }


    /**
     * Sets the accountInfo value for this AccountPreferences.
     * 
     * @param accountInfo
     */
    public void setAccountInfo(org.tempuri.Account accountInfo) {
        this.accountInfo = accountInfo;
    }


    /**
     * Gets the employmentInfo value for this AccountPreferences.
     * 
     * @return employmentInfo
     */
    public org.tempuri.Employment getEmploymentInfo() {
        return employmentInfo;
    }


    /**
     * Sets the employmentInfo value for this AccountPreferences.
     * 
     * @param employmentInfo
     */
    public void setEmploymentInfo(org.tempuri.Employment employmentInfo) {
        this.employmentInfo = employmentInfo;
    }


    /**
     * Gets the accountFeaturesInfo value for this AccountPreferences.
     * 
     * @return accountFeaturesInfo
     */
    public org.tempuri.AccountFeatures getAccountFeaturesInfo() {
        return accountFeaturesInfo;
    }


    /**
     * Sets the accountFeaturesInfo value for this AccountPreferences.
     * 
     * @param accountFeaturesInfo
     */
    public void setAccountFeaturesInfo(org.tempuri.AccountFeatures accountFeaturesInfo) {
        this.accountFeaturesInfo = accountFeaturesInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountPreferences)) return false;
        AccountPreferences other = (AccountPreferences) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountInfo==null && other.getAccountInfo()==null) || 
             (this.accountInfo!=null &&
              this.accountInfo.equals(other.getAccountInfo()))) &&
            ((this.employmentInfo==null && other.getEmploymentInfo()==null) || 
             (this.employmentInfo!=null &&
              this.employmentInfo.equals(other.getEmploymentInfo()))) &&
            ((this.accountFeaturesInfo==null && other.getAccountFeaturesInfo()==null) || 
             (this.accountFeaturesInfo!=null &&
              this.accountFeaturesInfo.equals(other.getAccountFeaturesInfo())));
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
        if (getAccountInfo() != null) {
            _hashCode += getAccountInfo().hashCode();
        }
        if (getEmploymentInfo() != null) {
            _hashCode += getEmploymentInfo().hashCode();
        }
        if (getAccountFeaturesInfo() != null) {
            _hashCode += getAccountFeaturesInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountPreferences.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "AccountPreferences"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AccountInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employmentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "EmploymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "Employment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountFeaturesInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org", "AccountFeaturesInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org", "AccountFeatures"));
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
