package com.babyshowerevent.BabyShowerEvent.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Table(name="events")
public class EventModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String eventName;
    private String applicantName;
    private String applicantAddress;
    private String applicantMobile;
    private String applicantEmail;
    private String eventAddress;
    private LocalDate eventDate;
    private LocalDateTime eventTime;
    private String eventMenuId;
    private Long addonId;
    private String eventCost;





    public EventModel(Long id, String eventName, String applicantName, String applicantAddress, String applicantMobile, String applicantEmail, String eventAddress, LocalDate eventDate, LocalDateTime eventTime, String eventMenuId, Long addonId, String eventCost) {
        this.id = id;
        this.eventName = eventName;
        this.applicantName = applicantName;
        this.applicantAddress = applicantAddress;
        this.applicantMobile = applicantMobile;
        this.applicantEmail = applicantEmail;
        this.eventAddress = eventAddress;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventMenuId = eventMenuId;
        this.addonId = addonId;
        this.eventCost = eventCost;
    }

    public EventModel() {
    }




    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getEventName()
    {
        return eventName;
    }

    public void setEventName(String eventName)
    {
        this.eventName = eventName;
    }

    public String getApplicantName()
    {
        return applicantName;
    }

    public void setApplicantName(String applicantName)
    {
        this.applicantName = applicantName;
    }

    public String getApplicantAddress()
    {
        return applicantAddress;
    }

    public void setApplicantAddress(String applicantAddress)
    {
        this.applicantAddress = applicantAddress;
    }

    public String getApplicantMobile()
    {
        return applicantMobile;
    }

    public void setApplicantMobile(String applicantMobile)
    {
        this.applicantMobile = applicantMobile;
    }

    public String getApplicantEmail()
    {
        return applicantEmail;
    }

    public void setApplicantEmail(String applicantEmail)
    {
        this.applicantEmail = applicantEmail;
    }

    public String getEventAddress()
    {
        return eventAddress;
    }

    public void setEventAddress(String eventAddress)
    {
        this.eventAddress = eventAddress;
    }

    public LocalDate getEventDate()
    {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate)
    {
        this.eventDate = eventDate;
    }

    public LocalDateTime getEventTime()
    {
        return eventTime;
    }

    public void setEventTime(LocalDateTime eventTime)
    {
        this.eventTime = eventTime;
    }

    public String getEventMenuId()
    {
        return eventMenuId;
    }

    public void setEventMenuId(String eventMenuId)
    {
        this.eventMenuId = eventMenuId;
    }

    public Long getAddonId()
    {
        return addonId;
    }

    public void setAddonId(Long addonId)
    {
        this.addonId = addonId;
    }

    public String getEventCost()
    {
        return eventCost;
    }

    public void setEventCost(String eventCost)
    {
        this.eventCost = eventCost;
    }


}

