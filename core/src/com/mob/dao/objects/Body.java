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
 * Stores information about a body
 * @author Rodrigo Troncoso
 * @version 0.1
 * @since 2014-04-10
 */
package com.mob.dao.objects;

import com.badlogic.gdx.utils.IntMap;
import com.mob.client.handlers.AssetsHandler;
import com.mob.client.textures.BundledAnimation;

public class Body {

    private IntMap<BundledAnimation> animations = new IntMap<BundledAnimation>();
	private int[] grhIndex;
	private int headOffsetX;
	private int headOffsetY;

	/**
	 * @param grhIndex
	 * @param headOffsetX
	 * @param headOffsetY
	 */
	public Body(int[] grhIndex, int headOffsetX, int headOffsetY) {
		this.grhIndex = grhIndex;
		this.headOffsetX = headOffsetX;
		this.headOffsetY = headOffsetY;

        this.loadAnimations();
	}

    private void loadAnimations() {
        for(int i = 0; i < grhIndex.length; i++) {
            Graphic grh = AssetsHandler.getGraphic(grhIndex[i]);
            if (grh != null) {
                animations.put(i, new BundledAnimation(AssetsHandler.getGraphic(grhIndex[i])));
            }
        }
    }

	public int getGraphic(int index) {
		return this.grhIndex[index];
	}
	
	public void setGraphic(int index, int graphic) {
		this.grhIndex[index] = graphic;
	}
	
	/**
	 * @return the grhIndex
	 */
	public int[] getBodyArray() {
		return grhIndex;
	}

	/**
	 * @param grhIndex the grhIndex to set
	 */
	public void setBodyArray(int[] grhIndex) {
		this.grhIndex = grhIndex;
	}

	/**
	 * @return the headOffsetX
	 */
	public int getHeadOffsetX() {
		return headOffsetX;
	}

	/**
	 * @param headOffsetX the headOffsetX to set
	 */
	public void setHeadOffsetX(int headOffsetX) {
		this.headOffsetX = headOffsetX;
	}

	/**
	 * @return the headOffsetY
	 */
	public int getHeadOffsetY() {
		return headOffsetY;
	}

	/**
	 * @param headOffsetY the headOffsetY to set
	 */
	public void setHeadOffsetY(int headOffsetY) {
		this.headOffsetY = headOffsetY;
	}

    public BundledAnimation getAnimation(int index) {
        return animations.get(index);
    }

    public IntMap<BundledAnimation> getAnimations() {
        return animations;
    }

    public void setAnimations(IntMap<BundledAnimation> animations) {
        this.animations = animations;
    }
}
