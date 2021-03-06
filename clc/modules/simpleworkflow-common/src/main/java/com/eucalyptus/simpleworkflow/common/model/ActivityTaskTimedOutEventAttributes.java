/*************************************************************************
 * Copyright 2014 Ent. Services Development Corporation LP
 *
 * Redistribution and use of this software in source and binary forms,
 * with or without modification, are permitted provided that the
 * following conditions are met:
 *
 *   Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 *   Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer
 *   in the documentation and/or other materials provided with the
 *   distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * This file may incorporate work covered under the following copyright
 * and permission notice:
 *
 *   Copyright 2010-2015 Amazon.com, Inc. or its affiliates.
 *   All Rights Reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License").
 *   You may not use this file except in compliance with the License.
 *   A copy of the License is located at
 *
 *     http://aws.amazon.com/apache2.0
 *
 *   or in the "license" file accompanying this file. This file is
 *   distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF
 *   ANY KIND, either express or implied. See the License for the specific
 *   language governing permissions and limitations under the License.
 ************************************************************************/
package com.eucalyptus.simpleworkflow.common.model;

import java.io.Serializable;

/**
 * <p>
 * Provides details of the <code>ActivityTaskTimedOut</code> event.
 * </p>
 */
public class ActivityTaskTimedOutEventAttributes implements Serializable, WorkflowEventAttributes {

    /**
     * The type of the timeout that caused this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START_TO_CLOSE, SCHEDULE_TO_START, SCHEDULE_TO_CLOSE, HEARTBEAT
     */
    private String timeoutType;

    /**
     * The ID of the <code>ActivityTaskScheduled</code> event that was
     * recorded when this activity task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     */
    private Long scheduledEventId;

    /**
     * The ID of the <code>ActivityTaskStarted</code> event recorded when
     * this activity task was started. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     */
    private Long startedEventId;

    /**
     * Contains the content of the <code>details</code> parameter for the
     * last call made by the activity to
     * <code>RecordActivityTaskHeartbeat</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String details;

    /**
     * The type of the timeout that caused this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START_TO_CLOSE, SCHEDULE_TO_START, SCHEDULE_TO_CLOSE, HEARTBEAT
     *
     * @return The type of the timeout that caused this event.
     *
     * @see ActivityTaskTimeoutType
     */
    public String getTimeoutType() {
        return timeoutType;
    }
    
    /**
     * The type of the timeout that caused this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START_TO_CLOSE, SCHEDULE_TO_START, SCHEDULE_TO_CLOSE, HEARTBEAT
     *
     * @param timeoutType The type of the timeout that caused this event.
     *
     * @see ActivityTaskTimeoutType
     */
    public void setTimeoutType(String timeoutType) {
        this.timeoutType = timeoutType;
    }
    
    /**
     * The type of the timeout that caused this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START_TO_CLOSE, SCHEDULE_TO_START, SCHEDULE_TO_CLOSE, HEARTBEAT
     *
     * @param timeoutType The type of the timeout that caused this event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ActivityTaskTimeoutType
     */
    public ActivityTaskTimedOutEventAttributes withTimeoutType(String timeoutType) {
        this.timeoutType = timeoutType;
        return this;
    }

    /**
     * The type of the timeout that caused this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START_TO_CLOSE, SCHEDULE_TO_START, SCHEDULE_TO_CLOSE, HEARTBEAT
     *
     * @param timeoutType The type of the timeout that caused this event.
     *
     * @see ActivityTaskTimeoutType
     */
    public void setTimeoutType(ActivityTaskTimeoutType timeoutType) {
        this.timeoutType = timeoutType.toString();
    }
    
    /**
     * The type of the timeout that caused this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>START_TO_CLOSE, SCHEDULE_TO_START, SCHEDULE_TO_CLOSE, HEARTBEAT
     *
     * @param timeoutType The type of the timeout that caused this event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ActivityTaskTimeoutType
     */
    public ActivityTaskTimedOutEventAttributes withTimeoutType(ActivityTaskTimeoutType timeoutType) {
        this.timeoutType = timeoutType.toString();
        return this;
    }

    /**
     * The ID of the <code>ActivityTaskScheduled</code> event that was
     * recorded when this activity task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     *
     * @return The ID of the <code>ActivityTaskScheduled</code> event that was
     *         recorded when this activity task was scheduled. This information can
     *         be useful for diagnosing problems by tracing back the chain of events
     *         leading up to this event.
     */
    public Long getScheduledEventId() {
        return scheduledEventId;
    }
    
    /**
     * The ID of the <code>ActivityTaskScheduled</code> event that was
     * recorded when this activity task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     *
     * @param scheduledEventId The ID of the <code>ActivityTaskScheduled</code> event that was
     *         recorded when this activity task was scheduled. This information can
     *         be useful for diagnosing problems by tracing back the chain of events
     *         leading up to this event.
     */
    public void setScheduledEventId(Long scheduledEventId) {
        this.scheduledEventId = scheduledEventId;
    }
    
    /**
     * The ID of the <code>ActivityTaskScheduled</code> event that was
     * recorded when this activity task was scheduled. This information can
     * be useful for diagnosing problems by tracing back the chain of events
     * leading up to this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledEventId The ID of the <code>ActivityTaskScheduled</code> event that was
     *         recorded when this activity task was scheduled. This information can
     *         be useful for diagnosing problems by tracing back the chain of events
     *         leading up to this event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ActivityTaskTimedOutEventAttributes withScheduledEventId(Long scheduledEventId) {
        this.scheduledEventId = scheduledEventId;
        return this;
    }

    /**
     * The ID of the <code>ActivityTaskStarted</code> event recorded when
     * this activity task was started. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     *
     * @return The ID of the <code>ActivityTaskStarted</code> event recorded when
     *         this activity task was started. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to
     *         this event.
     */
    public Long getStartedEventId() {
        return startedEventId;
    }
    
    /**
     * The ID of the <code>ActivityTaskStarted</code> event recorded when
     * this activity task was started. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     *
     * @param startedEventId The ID of the <code>ActivityTaskStarted</code> event recorded when
     *         this activity task was started. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to
     *         this event.
     */
    public void setStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
    }
    
    /**
     * The ID of the <code>ActivityTaskStarted</code> event recorded when
     * this activity task was started. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to
     * this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startedEventId The ID of the <code>ActivityTaskStarted</code> event recorded when
     *         this activity task was started. This information can be useful for
     *         diagnosing problems by tracing back the chain of events leading up to
     *         this event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ActivityTaskTimedOutEventAttributes withStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
        return this;
    }

    /**
     * Contains the content of the <code>details</code> parameter for the
     * last call made by the activity to
     * <code>RecordActivityTaskHeartbeat</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return Contains the content of the <code>details</code> parameter for the
     *         last call made by the activity to
     *         <code>RecordActivityTaskHeartbeat</code>.
     */
    public String getDetails() {
        return details;
    }
    
    /**
     * Contains the content of the <code>details</code> parameter for the
     * last call made by the activity to
     * <code>RecordActivityTaskHeartbeat</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param details Contains the content of the <code>details</code> parameter for the
     *         last call made by the activity to
     *         <code>RecordActivityTaskHeartbeat</code>.
     */
    public void setDetails(String details) {
        this.details = details;
    }
    
    /**
     * Contains the content of the <code>details</code> parameter for the
     * last call made by the activity to
     * <code>RecordActivityTaskHeartbeat</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param details Contains the content of the <code>details</code> parameter for the
     *         last call made by the activity to
     *         <code>RecordActivityTaskHeartbeat</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ActivityTaskTimedOutEventAttributes withDetails(String details) {
        this.details = details;
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
        if (getTimeoutType() != null) sb.append("TimeoutType: " + getTimeoutType() + ",");
        if (getScheduledEventId() != null) sb.append("ScheduledEventId: " + getScheduledEventId() + ",");
        if (getStartedEventId() != null) sb.append("StartedEventId: " + getStartedEventId() + ",");
        if (getDetails() != null) sb.append("Details: " + getDetails() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTimeoutType() == null) ? 0 : getTimeoutType().hashCode()); 
        hashCode = prime * hashCode + ((getScheduledEventId() == null) ? 0 : getScheduledEventId().hashCode()); 
        hashCode = prime * hashCode + ((getStartedEventId() == null) ? 0 : getStartedEventId().hashCode()); 
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ActivityTaskTimedOutEventAttributes == false) return false;
        ActivityTaskTimedOutEventAttributes other = (ActivityTaskTimedOutEventAttributes)obj;
        
        if (other.getTimeoutType() == null ^ this.getTimeoutType() == null) return false;
        if (other.getTimeoutType() != null && other.getTimeoutType().equals(this.getTimeoutType()) == false) return false; 
        if (other.getScheduledEventId() == null ^ this.getScheduledEventId() == null) return false;
        if (other.getScheduledEventId() != null && other.getScheduledEventId().equals(this.getScheduledEventId()) == false) return false; 
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null) return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false) return false; 
        if (other.getDetails() == null ^ this.getDetails() == null) return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false) return false; 
        return true;
    }

    @Override
    public void attach(HistoryEvent historyEvent) {
      historyEvent.setActivityTaskTimedOutEventAttributes(this);
    }
}
    