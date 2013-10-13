/*******************************************************************************
 * Copyright (c) 2011 GigaSpaces Technologies Ltd. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.cloudifysource.domain;

import org.cloudifysource.domain.internal.CloudifyDSLEntity;

/**
 * an SLA for processing unit deployment. this POJO is generated by the service groovy file and contains data regarding
 * the JVM's memory allocation and processing unit availability. All types of processing units hold an SLA object that
 * defines the JVM's machine definitions.
 * 
 * @author adaml
 * 
 */
@CloudifyDSLEntity(name = "sla", clazz = Sla.class, allowInternalNode = true, allowRootNode = false)
public class Sla {

	private Integer memoryCapacity;
	private Integer maxMemoryCapacity;
	private boolean highlyAvailable = true;
	private Integer memoryCapacityPerContainer;

	public Integer getMemoryCapacity() {
		return this.memoryCapacity;
	}

	/**
	 * Processing unit's maximum memory capacity.
	 * 
	 * @return - the processing unit's maximum memory capacity
	 */
	public Integer getMaxMemoryCapacity() {
		return this.maxMemoryCapacity;
	}

	/**
	 * Defines whether to create a backup for the Processing unit.
	 * 
	 * @return - Availability state.
	 */
	public boolean getHighlyAvailable() {
		return this.highlyAvailable;
	}

	/**
	 * Memory capacity definition for GSC.
	 * 
	 * @return - the allocated memory capacity for container.
	 */
	public Integer getMemoryCapacityPerContainer() {
		return this.memoryCapacityPerContainer;
	}

	// Setters are all called by the DSL reader s.t values are being injected directly from the groovy DSL.
	public void setMemoryCapacity(final Integer memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
	}

	public void setMaxMemoryCapacity(final Integer maxMemoryCapacity) {
		this.maxMemoryCapacity = maxMemoryCapacity;
	}

	public void setHighlyAvailable(final boolean highlyAvailable) {
		this.highlyAvailable = highlyAvailable;
	}

	public void setMemoryCapacityPerContainer(final Integer memoryCapacityPerContainer) {
		this.memoryCapacityPerContainer = memoryCapacityPerContainer;
	}
}