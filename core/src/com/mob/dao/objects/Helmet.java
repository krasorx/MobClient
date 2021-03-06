/*******************************************************************************
 * Copyright (C) 2014  Rodrigo Troncoso
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as
 *     published by the Free Software Foundation, either version 3 of the
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
/**
 * Stores information about a helmet
 * @author Rodrigo Troncoso
 * @version 0.1
 * @since 2014-04-10
 */
package com.mob.dao.objects;

public class Helmet {

	private int[] helmetIndex;

	/**
	 * @param helmetIndex
	 */
	public Helmet(int[] helmetIndex) {
		super();
		this.helmetIndex = helmetIndex;
	}

	/**
	 * @return the helmetIndex
	 */
	public int[] getHelmetIndex() {
		return helmetIndex;
	}

	/**
	 * @param helmetIndex the helmetIndex to set
	 */
	public void setHelmetIndex(int[] helmetIndex) {
		this.helmetIndex = helmetIndex;
	}
	
	public int getHelmet(int pIndex) {
		return this.helmetIndex[pIndex];
	}

}
