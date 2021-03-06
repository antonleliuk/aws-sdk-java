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
package com.amazonaws.services.health.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.health.model.*;

import com.amazonaws.protocol.json.*;

/**
 * EventFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventFilterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EventFilter eventFilter, StructuredJsonGenerator jsonGenerator) {

        if (eventFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.List<String> eventArnsList = eventFilter.getEventArns();
            if (eventArnsList != null) {
                jsonGenerator.writeFieldName("eventArns");
                jsonGenerator.writeStartArray();
                for (String eventArnsListValue : eventArnsList) {
                    if (eventArnsListValue != null) {
                        jsonGenerator.writeValue(eventArnsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> eventTypeCodesList = eventFilter.getEventTypeCodes();
            if (eventTypeCodesList != null) {
                jsonGenerator.writeFieldName("eventTypeCodes");
                jsonGenerator.writeStartArray();
                for (String eventTypeCodesListValue : eventTypeCodesList) {
                    if (eventTypeCodesListValue != null) {
                        jsonGenerator.writeValue(eventTypeCodesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> servicesList = eventFilter.getServices();
            if (servicesList != null) {
                jsonGenerator.writeFieldName("services");
                jsonGenerator.writeStartArray();
                for (String servicesListValue : servicesList) {
                    if (servicesListValue != null) {
                        jsonGenerator.writeValue(servicesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> regionsList = eventFilter.getRegions();
            if (regionsList != null) {
                jsonGenerator.writeFieldName("regions");
                jsonGenerator.writeStartArray();
                for (String regionsListValue : regionsList) {
                    if (regionsListValue != null) {
                        jsonGenerator.writeValue(regionsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> availabilityZonesList = eventFilter.getAvailabilityZones();
            if (availabilityZonesList != null) {
                jsonGenerator.writeFieldName("availabilityZones");
                jsonGenerator.writeStartArray();
                for (String availabilityZonesListValue : availabilityZonesList) {
                    if (availabilityZonesListValue != null) {
                        jsonGenerator.writeValue(availabilityZonesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<DateTimeRange> startTimesList = eventFilter.getStartTimes();
            if (startTimesList != null) {
                jsonGenerator.writeFieldName("startTimes");
                jsonGenerator.writeStartArray();
                for (DateTimeRange startTimesListValue : startTimesList) {
                    if (startTimesListValue != null) {

                        DateTimeRangeJsonMarshaller.getInstance().marshall(startTimesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<DateTimeRange> endTimesList = eventFilter.getEndTimes();
            if (endTimesList != null) {
                jsonGenerator.writeFieldName("endTimes");
                jsonGenerator.writeStartArray();
                for (DateTimeRange endTimesListValue : endTimesList) {
                    if (endTimesListValue != null) {

                        DateTimeRangeJsonMarshaller.getInstance().marshall(endTimesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<DateTimeRange> lastUpdatedTimesList = eventFilter.getLastUpdatedTimes();
            if (lastUpdatedTimesList != null) {
                jsonGenerator.writeFieldName("lastUpdatedTimes");
                jsonGenerator.writeStartArray();
                for (DateTimeRange lastUpdatedTimesListValue : lastUpdatedTimesList) {
                    if (lastUpdatedTimesListValue != null) {

                        DateTimeRangeJsonMarshaller.getInstance().marshall(lastUpdatedTimesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> entityArnsList = eventFilter.getEntityArns();
            if (entityArnsList != null) {
                jsonGenerator.writeFieldName("entityArns");
                jsonGenerator.writeStartArray();
                for (String entityArnsListValue : entityArnsList) {
                    if (entityArnsListValue != null) {
                        jsonGenerator.writeValue(entityArnsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> entityValuesList = eventFilter.getEntityValues();
            if (entityValuesList != null) {
                jsonGenerator.writeFieldName("entityValues");
                jsonGenerator.writeStartArray();
                for (String entityValuesListValue : entityValuesList) {
                    if (entityValuesListValue != null) {
                        jsonGenerator.writeValue(entityValuesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> eventTypeCategoriesList = eventFilter.getEventTypeCategories();
            if (eventTypeCategoriesList != null) {
                jsonGenerator.writeFieldName("eventTypeCategories");
                jsonGenerator.writeStartArray();
                for (String eventTypeCategoriesListValue : eventTypeCategoriesList) {
                    if (eventTypeCategoriesListValue != null) {
                        jsonGenerator.writeValue(eventTypeCategoriesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<java.util.Map<String, String>> tagsList = eventFilter.getTags();
            if (tagsList != null) {
                jsonGenerator.writeFieldName("tags");
                jsonGenerator.writeStartArray();
                for (java.util.Map<String, String> tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        jsonGenerator.writeStartObject();
                        for (Map.Entry<String, String> TagsListMapEntry : tagsListValue.entrySet()) {
                            if (TagsListMapEntry.getValue() != null) {
                                jsonGenerator.writeFieldName(TagsListMapEntry.getKey());
                                jsonGenerator.writeValue(TagsListMapEntry.getValue());
                            }
                        }
                        jsonGenerator.writeEndObject();
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> eventStatusCodesList = eventFilter.getEventStatusCodes();
            if (eventStatusCodesList != null) {
                jsonGenerator.writeFieldName("eventStatusCodes");
                jsonGenerator.writeStartArray();
                for (String eventStatusCodesListValue : eventStatusCodesList) {
                    if (eventStatusCodesListValue != null) {
                        jsonGenerator.writeValue(eventStatusCodesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EventFilterJsonMarshaller instance;

    public static EventFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventFilterJsonMarshaller();
        return instance;
    }

}
