package com.example.iuliu.aa;

/**
 * Created by Iuliu on 2016-10-18.
 */

public class Visitor {
    private String visitorId;
    private String firstName;
    private String lastName;
    private String visitorEmail;
    private String visitStart;
    private String visitEnd;
    private boolean repeatVisit;
    private String visitEnum;

    public Visitor( String visitorId, String firstName,String lastName,String visitorEmail,String visitStart,String visitEnd,boolean repeatVisit,String visitEnum){
        this.setVisitorId(visitorId);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setVisitorEmail(visitorEmail);
        this.setVisitStart(visitStart);
        this.setVisitEnd(visitEnd);
        this.setRepeatVisit(repeatVisit);
        this.setVisitEnum(visitEnum);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getVisitStart() {
        return visitStart;
    }

    public void setVisitStart(String visitStart) {
        this.visitStart = visitStart;
    }

    public String getVisitEnd() {
        return visitEnd;
    }

    public void setVisitEnd(String visitEnd) {
        this.visitEnd = visitEnd;
    }

    public boolean isRepeatVisit() {
        return repeatVisit;
    }

    public void setRepeatVisit(boolean repeatVisit) {
        this.repeatVisit = repeatVisit;
    }

    public String getVisitEnum() {
        return visitEnum;
    }

    public void setVisitEnum(String visitEnum) {
        this.visitEnum = visitEnum;
    }

    public String getVisitorEmail() {
        return visitorEmail;
    }

    public void setVisitorEmail(String visitorEmail) {
        this.visitorEmail = visitorEmail;
    }

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }
}
