package com.example.iuliu.aa;

/**
 * Created by Iuliu on 2016-10-18.
 */

public class Incidents {
    private String incidentId;
    private String incidentTime;
    private String incidentSeverity;
    private String incidentNotes;
    public Incidents(String id, String incidentTime,String incidentSeverity,String incidentNotes)
    {
        this.setIncidentId(id);
        this.setIncidentTime(incidentTime);
        this.setIncidentSeverity(incidentSeverity);
        this.setIncidentNotes(incidentNotes);
    }

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public String getIncidentTime() {
        return incidentTime;
    }

    public void setIncidentTime(String incidentTime) {
        this.incidentTime = incidentTime;
    }

    public String getIncidentSeverity() {
        return incidentSeverity;
    }

    public void setIncidentSeverity(String incidentSeverity) {
        this.incidentSeverity = incidentSeverity;
    }

    public String getIncidentNotes() {
        return incidentNotes;
    }

    public void setIncidentNotes(String incidentNotes) {
        this.incidentNotes = incidentNotes;
    }
}
