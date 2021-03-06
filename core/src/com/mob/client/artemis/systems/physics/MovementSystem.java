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
package com.mob.client.artemis.systems.physics;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.Entity;
import com.artemis.annotations.Wire;
import com.artemis.systems.EntityProcessingSystem;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.mob.client.artemis.components.physics.Physics;
import com.mob.client.artemis.components.position.Pos;

@Wire
public class MovementSystem extends EntityProcessingSystem {

	private ComponentMapper<Physics> xm;
	private ComponentMapper<Pos> pm;

	public MovementSystem() {
		super(Aspect.all(Physics.class,
                Pos.class));
	}

    @Override
    protected void process(Entity entity) {

        final Physics phys = xm.get(entity);
        final Pos pos = pm.get(entity);

        pos.x += phys.speedX * world.getDelta();
        pos.y += phys.speedY * world.getDelta();

        if(Gdx.input.isKeyPressed(Input.Keys.SPACE))
            Gdx.app.log(MovementSystem.class.toString(), "X: " + String.valueOf(pos.x) + " , Y: " + String.valueOf(pos.y));

    }

}
