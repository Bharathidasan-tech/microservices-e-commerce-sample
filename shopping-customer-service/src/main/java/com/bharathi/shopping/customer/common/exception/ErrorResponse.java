package com.bharathi.shopping.customer.common.exception;


public class ErrorResponse
{

    /** The status. */
    private int status;

    /** The message. */
    private String message;

    /** The time stamp. */
    private long timeStamp;

    /**
     * @return int holds the status
     */
    public int getStatus()
    {
        return status;
    }

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(int status)
    {
        this.status = status;
    }

    /**
     * @return String holds the message
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * @param message
     *            the message to set
     */
    public void setMessage(String message)
    {
        this.message = message;
    }

    /**
     * @return long holds the timeStamp
     */
    public long getTimeStamp()
    {
        return timeStamp;
    }

    /**
     * @param timeStamp
     *            the timeStamp to set
     */
    public void setTimeStamp(long timeStamp)
    {
        this.timeStamp = timeStamp;
    }

 
    public ErrorResponse(int status, String message, long timeStamp)
    {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public ErrorResponse()
    {
    }
}
