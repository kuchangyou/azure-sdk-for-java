/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.MigrationRecoveryPoint;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.MigrationRecoveryPointProperties;

class MigrationRecoveryPointImpl extends IndexableRefreshableWrapperImpl<MigrationRecoveryPoint, MigrationRecoveryPointInner> implements MigrationRecoveryPoint {
    private final RecoveryServicesManager manager;
    private String fabricName;
    private String protectionContainerName;
    private String migrationItemName;
    private String migrationRecoveryPointName;

    MigrationRecoveryPointImpl(MigrationRecoveryPointInner inner,  RecoveryServicesManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.fabricName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationFabrics");
        this.protectionContainerName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationProtectionContainers");
        this.migrationItemName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationMigrationItems");
        this.migrationRecoveryPointName = IdParsingUtils.getValueFromIdByName(inner.id(), "migrationRecoveryPoints");
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<MigrationRecoveryPointInner> getInnerAsync() {
        MigrationRecoveryPointsInner client = this.manager().inner().migrationRecoveryPoints();
        return client.getAsync(this.fabricName, this.protectionContainerName, this.migrationItemName, this.migrationRecoveryPointName);
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public MigrationRecoveryPointProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
