/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The assembly properties definition.
 */
public class AssemblyProperties extends ArtifactContentPropertiesDefinition {
    /**
     * The assembly name.
     */
    @JsonProperty(value = "assemblyName", required = true)
    private String assemblyName;

    /**
     * The assembly version.
     */
    @JsonProperty(value = "assemblyVersion")
    private String assemblyVersion;

    /**
     * The assembly culture.
     */
    @JsonProperty(value = "assemblyCulture")
    private String assemblyCulture;

    /**
     * The assembly public key token.
     */
    @JsonProperty(value = "assemblyPublicKeyToken")
    private String assemblyPublicKeyToken;

    /**
     * Get the assembly name.
     *
     * @return the assemblyName value
     */
    public String assemblyName() {
        return this.assemblyName;
    }

    /**
     * Set the assembly name.
     *
     * @param assemblyName the assemblyName value to set
     * @return the AssemblyProperties object itself.
     */
    public AssemblyProperties withAssemblyName(String assemblyName) {
        this.assemblyName = assemblyName;
        return this;
    }

    /**
     * Get the assembly version.
     *
     * @return the assemblyVersion value
     */
    public String assemblyVersion() {
        return this.assemblyVersion;
    }

    /**
     * Set the assembly version.
     *
     * @param assemblyVersion the assemblyVersion value to set
     * @return the AssemblyProperties object itself.
     */
    public AssemblyProperties withAssemblyVersion(String assemblyVersion) {
        this.assemblyVersion = assemblyVersion;
        return this;
    }

    /**
     * Get the assembly culture.
     *
     * @return the assemblyCulture value
     */
    public String assemblyCulture() {
        return this.assemblyCulture;
    }

    /**
     * Set the assembly culture.
     *
     * @param assemblyCulture the assemblyCulture value to set
     * @return the AssemblyProperties object itself.
     */
    public AssemblyProperties withAssemblyCulture(String assemblyCulture) {
        this.assemblyCulture = assemblyCulture;
        return this;
    }

    /**
     * Get the assembly public key token.
     *
     * @return the assemblyPublicKeyToken value
     */
    public String assemblyPublicKeyToken() {
        return this.assemblyPublicKeyToken;
    }

    /**
     * Set the assembly public key token.
     *
     * @param assemblyPublicKeyToken the assemblyPublicKeyToken value to set
     * @return the AssemblyProperties object itself.
     */
    public AssemblyProperties withAssemblyPublicKeyToken(String assemblyPublicKeyToken) {
        this.assemblyPublicKeyToken = assemblyPublicKeyToken;
        return this;
    }

}