/*******************************************************************************
 *  Imixs Workflow 
 *  Copyright (C) 2001, 2011 Imixs Software Solutions GmbH,  
 *  http://www.imixs.com
 *  
 *  This program is free software; you can redistribute it and/or 
 *  modify it under the terms of the GNU General Public License 
 *  as published by the Free Software Foundation; either version 2 
 *  of the License, or (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful, 
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of 
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 *  General Public License for more details.
 *  
 *  You can receive a copy of the GNU General Public
 *  License at http://www.gnu.org/licenses/gpl.html
 *  
 *  Project: 
 *  	http://www.imixs.org
 *  	http://java.net/projects/imixs-workflow
 *  
 *  Contributors:  
 *  	Imixs Software Solutions GmbH - initial API and implementation
 *  	Ralph Soika - Software Developer
 *******************************************************************************/

package org.imixs.marty.web.office;

import javax.ejb.EJB;
import javax.faces.event.ActionEvent;

import org.imixs.office.ejb.security.LDAPGroupLookupService;

/**
 * This backingBean supports namelookups to translate a technical user account
 * into a Displayname to be used in the Frontend. The Bean uses the
 * profileService EJB to lookup a name and holds a Cache to prevent repeatable
 * lookups.
 * 
 * @author rsoika
 * 
 */
public class LdapMB {

	
	/* Profile Service */
	@EJB
	LDAPGroupLookupService ldapService;

	

	/**
	 * resets the ldap cache
	 * 
	 * @return
	 */
	public void doResetCache(ActionEvent event) {
		ldapService.resetCache();
	}

	


	

}
