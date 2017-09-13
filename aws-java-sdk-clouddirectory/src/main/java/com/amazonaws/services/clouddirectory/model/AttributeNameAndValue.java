/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies the attribute name and value for a typed link.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/AttributeNameAndValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeNameAndValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attribute name of the typed link.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The value for the typed link.
     * </p>
     */
    private TypedAttributeValue value;

    /**
     * <p>
     * The attribute name of the typed link.
     * </p>
     * 
     * @param attributeName
     *        The attribute name of the typed link.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The attribute name of the typed link.
     * </p>
     * 
     * @return The attribute name of the typed link.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The attribute name of the typed link.
     * </p>
     * 
     * @param attributeName
     *        The attribute name of the typed link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeNameAndValue withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The value for the typed link.
     * </p>
     * 
     * @param value
     *        The value for the typed link.
     */

    public void setValue(TypedAttributeValue value) {
        this.value = value;
    }

    /**
     * <p>
     * The value for the typed link.
     * </p>
     * 
     * @return The value for the typed link.
     */

    public TypedAttributeValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value for the typed link.
     * </p>
     * 
     * @param value
     *        The value for the typed link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeNameAndValue withValue(TypedAttributeValue value) {
        setValue(value);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeNameAndValue == false)
            return false;
        AttributeNameAndValue other = (AttributeNameAndValue) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public AttributeNameAndValue clone() {
        try {
            return (AttributeNameAndValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.AttributeNameAndValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}