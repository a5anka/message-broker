/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.broker.client.cmd.impl.create;

import com.beust.jcommander.Parameters;
import org.wso2.broker.client.cmd.AbstractCmd;

import static org.wso2.broker.client.utils.Utils.createUsageException;

/**
 * Command representing the resource creation.
 */
@Parameters(commandDescription = "Create MB resources")
public class CreateCmd extends AbstractCmd {

    @Override
    public void execute() {
        if (!help) {
            throw createUsageException("a command is expected after 'create'");
        }
        processHelpLogs();
    }

    @Override
    public String getName() {
        return "create";
    }

    @Override
    public void printLongDesc(StringBuilder out) {
        out.append("create a resource in MB with parameters\n");
    }

    @Override
    public void printUsage(StringBuilder out) {
        out.append("Usage:\n");
        out.append("\tmb create exchange [exchange-name] [options]*\n");
        out.append("\tmb create queue [queue-name] [options]*\n");
    }
}
