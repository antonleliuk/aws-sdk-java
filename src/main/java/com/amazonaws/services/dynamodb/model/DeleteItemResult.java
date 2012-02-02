/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodb.model;

/**
 * Delete Item Result
 */
public class DeleteItemResult {

    /**
     * If the ReturnValues parameter is provided as ALL_OLD in the request,
     * Amazon DynamoDB returns an array of attribute name-value pairs
     * (essentially, the deleted item). Otherwise, the response contains an
     * empty set.
     */
    private java.util.Map<String,AttributeValue> attributes;

    /**
     * The number of Capacity Units of the provisioned throughput of the
     * table consumed during the operation. GetItem, BatchGetItem, Query, and
     * Scan operations consume Read Capacity Units, while PutItem,
     * UpdateItem, and DeleteItem operations consume Write Capacity Units.
     */
    private Double consumedCapacityUnits;

    /**
     * If the ReturnValues parameter is provided as ALL_OLD in the request,
     * Amazon DynamoDB returns an array of attribute name-value pairs
     * (essentially, the deleted item). Otherwise, the response contains an
     * empty set.
     *
     * @return If the ReturnValues parameter is provided as ALL_OLD in the request,
     *         Amazon DynamoDB returns an array of attribute name-value pairs
     *         (essentially, the deleted item). Otherwise, the response contains an
     *         empty set.
     */
    public java.util.Map<String,AttributeValue> getAttributes() {
        
        return attributes;
    }
    
    /**
     * If the ReturnValues parameter is provided as ALL_OLD in the request,
     * Amazon DynamoDB returns an array of attribute name-value pairs
     * (essentially, the deleted item). Otherwise, the response contains an
     * empty set.
     *
     * @param attributes If the ReturnValues parameter is provided as ALL_OLD in the request,
     *         Amazon DynamoDB returns an array of attribute name-value pairs
     *         (essentially, the deleted item). Otherwise, the response contains an
     *         empty set.
     */
    public void setAttributes(java.util.Map<String,AttributeValue> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * If the ReturnValues parameter is provided as ALL_OLD in the request,
     * Amazon DynamoDB returns an array of attribute name-value pairs
     * (essentially, the deleted item). Otherwise, the response contains an
     * empty set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes If the ReturnValues parameter is provided as ALL_OLD in the request,
     *         Amazon DynamoDB returns an array of attribute name-value pairs
     *         (essentially, the deleted item). Otherwise, the response contains an
     *         empty set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteItemResult withAttributes(java.util.Map<String,AttributeValue> attributes) {
        setAttributes(attributes);
        return this;
    }
    
    /**
     * The number of Capacity Units of the provisioned throughput of the
     * table consumed during the operation. GetItem, BatchGetItem, Query, and
     * Scan operations consume Read Capacity Units, while PutItem,
     * UpdateItem, and DeleteItem operations consume Write Capacity Units.
     *
     * @return The number of Capacity Units of the provisioned throughput of the
     *         table consumed during the operation. GetItem, BatchGetItem, Query, and
     *         Scan operations consume Read Capacity Units, while PutItem,
     *         UpdateItem, and DeleteItem operations consume Write Capacity Units.
     */
    public Double getConsumedCapacityUnits() {
        return consumedCapacityUnits;
    }
    
    /**
     * The number of Capacity Units of the provisioned throughput of the
     * table consumed during the operation. GetItem, BatchGetItem, Query, and
     * Scan operations consume Read Capacity Units, while PutItem,
     * UpdateItem, and DeleteItem operations consume Write Capacity Units.
     *
     * @param consumedCapacityUnits The number of Capacity Units of the provisioned throughput of the
     *         table consumed during the operation. GetItem, BatchGetItem, Query, and
     *         Scan operations consume Read Capacity Units, while PutItem,
     *         UpdateItem, and DeleteItem operations consume Write Capacity Units.
     */
    public void setConsumedCapacityUnits(Double consumedCapacityUnits) {
        this.consumedCapacityUnits = consumedCapacityUnits;
    }
    
    /**
     * The number of Capacity Units of the provisioned throughput of the
     * table consumed during the operation. GetItem, BatchGetItem, Query, and
     * Scan operations consume Read Capacity Units, while PutItem,
     * UpdateItem, and DeleteItem operations consume Write Capacity Units.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consumedCapacityUnits The number of Capacity Units of the provisioned throughput of the
     *         table consumed during the operation. GetItem, BatchGetItem, Query, and
     *         Scan operations consume Read Capacity Units, while PutItem,
     *         UpdateItem, and DeleteItem operations consume Write Capacity Units.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteItemResult withConsumedCapacityUnits(Double consumedCapacityUnits) {
        this.consumedCapacityUnits = consumedCapacityUnits;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (attributes != null) sb.append("Attributes: " + attributes + ", ");
        if (consumedCapacityUnits != null) sb.append("ConsumedCapacityUnits: " + consumedCapacityUnits + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getConsumedCapacityUnits() == null) ? 0 : getConsumedCapacityUnits().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DeleteItemResult == false) return false;
        DeleteItemResult other = (DeleteItemResult)obj;
        
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        if (other.getConsumedCapacityUnits() == null ^ this.getConsumedCapacityUnits() == null) return false;
        if (other.getConsumedCapacityUnits() != null && other.getConsumedCapacityUnits().equals(this.getConsumedCapacityUnits()) == false) return false; 
        return true;
    }
    
}
    