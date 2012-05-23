/**
 * DateObjectService - Interface for DateObjectServiceImpl
 * @see DateObjectServiceImpl
 *
 * @author Eric Schmidt
 * @created 05/22/2012
 */

package com.example.service;

import com.example.entity.DateObject;
import org.springframework.dao.DataAccessException;

public interface DateObjectService {
    public DateObject getCurrentDateObject() throws DataAccessException;

    public DateObject getOrCreateDateObject() throws DataAccessException;
}
