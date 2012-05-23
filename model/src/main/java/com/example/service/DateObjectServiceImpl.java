/**
 * DateObjectServiceImpl - Provide basic services for DateObject objects
 *
 * @author Eric Schmidt
 * @created 05/22/2012
 */

package com.example.service;

import com.example.entity.DateObject;
import java.util.Date;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Transactional
@Service("dateObjectService")
public class DateObjectServiceImpl implements DateObjectService {
    protected SessionFactory sessionFactory;
	
    @Autowired
    public DateObjectServiceImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
    @Transactional(readOnly = true)
    public DateObject getCurrentDateObject() throws DataAccessException {
        return null;
    }
	
    @Transactional(readOnly = false)
    public DateObject getOrCreateDateObject() throws DataAccessException {
        DateObject mydo = null;

        mydo = getCurrentDateObject();

        if (mydo == null) {
            mydo = new DateObject();
            mydo.setDate(new Date());
            sessionFactory.getCurrentSession().save(mydo);
        }

        mydo.setLastAccessed(new Date());

        return mydo;
    }
}
