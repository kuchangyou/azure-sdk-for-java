/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2018_05_31;

import rx.Observable;
import com.microsoft.azure.management.costmanagement.v2018_05_31.implementation.ResourceGroupDimensionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ResourceGroupDimensions.
 */
public interface ResourceGroupDimensions extends HasInner<ResourceGroupDimensionsInner> {
    /**
     * Lists the dimensions by resource group Id.
     *
     * @param resourceGroupName Azure Resource Group Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Dimension> listByResourceGroupAsync(String resourceGroupName);

}