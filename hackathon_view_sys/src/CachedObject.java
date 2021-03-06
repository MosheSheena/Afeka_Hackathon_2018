/**
* Title:        Caching
* Description:  A Generic Cache Object wrapper.  Implements the Cacheable
interface
*               uses a TimeToLive stategy for CacheObject expiration.
* Copyright:    Copyright (c) 2001
* Company:  JavaWorld
* Filename: CacheManagerTestProgram.java
* @author Jonathan Lurie
* @version 1.0
*/

package view_sys;

public class CachedObject implements Cacheable
{
    private java.util.Date dateofExpiration = null;
    private Object identifier = null;
    public Object object = null;
    
    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public CachedObject(Object obj, Object id, int minutesToLive)
    {
      this.object = obj;
      this.identifier = id;
      // minutesToLive of 0 means it lives on indefinitely.
      if (minutesToLive != 0)
      {
        dateofExpiration = new java.util.Date();
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(dateofExpiration);
        cal.add(java.util.Calendar.MINUTE, minutesToLive);
        dateofExpiration = cal.getTime();
      }
    }
    
    public boolean isExpired()
    {
        // Remember if the minutes to live is zero then it lives forever!
        if (dateofExpiration != null)
        {
          // date of expiration is compared.
          if (dateofExpiration.before(new java.util.Date()))
          {
            System.out.println("CachedResultSet.isExpired:  Expired from Cache! EXPIRE TIME: " + dateofExpiration.toString() + " CURRENT TIME: " + (new java.util.Date()).toString());
            return true;
          }
          else
          {
            System.out.println("CachedResultSet.isExpired:  Expired not from Cache!");
            return false;
          }
        }
        else // This means it lives forever!
          return false;
    }
    
    public Object getIdentifier()
    {
      return identifier;
    }
    
}
