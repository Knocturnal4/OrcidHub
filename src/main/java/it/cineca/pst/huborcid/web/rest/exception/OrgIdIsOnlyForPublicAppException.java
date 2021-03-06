/**
 * This file is part of huborcid.
 *
 * huborcid is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * huborcid is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with huborcid.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.cineca.pst.huborcid.web.rest.exception;


public class OrgIdIsOnlyForPublicAppException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -266999866708034059L;
	
	String app = null;
	
	public OrgIdIsOnlyForPublicAppException(String app) {
		super("app: "+app +" doesn't have th flag allOrg!");
		this.app = app;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}


}
