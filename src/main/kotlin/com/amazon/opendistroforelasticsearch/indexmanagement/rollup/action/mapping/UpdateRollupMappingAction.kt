/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazon.opendistroforelasticsearch.indexmanagement.rollup.action.mapping

import org.opensearch.action.ActionType
import org.opensearch.action.support.master.AcknowledgedResponse
import org.opensearch.common.io.stream.Writeable

class UpdateRollupMappingAction : ActionType<AcknowledgedResponse>(NAME, reader) {

    companion object {
        const val NAME = "cluster:admin/opendistro/rollup/mapping/update"
        val INSTANCE = UpdateRollupMappingAction()
        val reader = Writeable.Reader { AcknowledgedResponse(it) }
    }

    override fun getResponseReader(): Writeable.Reader<AcknowledgedResponse> = reader
}
