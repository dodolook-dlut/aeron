/*
 * Copyright 2014-2018 Real Logic Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.aeron.driver.status;

import io.aeron.status.LocalSocketAddressStatus;
import org.agrona.MutableDirectBuffer;
import org.agrona.concurrent.status.AtomicCounter;
import org.agrona.concurrent.status.CountersManager;

/**
 * The send end of a local socket address, i.e. control endpoint of a publication.
 */
public class SendLocalSocketAddress
{
    /**
     * The human readable name for the beginning of a label.
     */
    public static final String NAME = "send-local-sockaddr";

    public static AtomicCounter allocate(
        final MutableDirectBuffer tempBuffer, final CountersManager countersManager, final int channelStatusId)
    {
        return LocalSocketAddressStatus.allocate(
            tempBuffer,
            countersManager,
            channelStatusId,
            NAME,
            LocalSocketAddressStatus.LOCAL_SOCKET_ADDRESS_STATUS_TYPE_ID);
    }
}