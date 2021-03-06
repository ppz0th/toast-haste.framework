/*
* Copyright 2016 NHN Entertainment Corp.
*
* NHN Entertainment Corp. licenses this file to you under the Apache License,
* version 2.0 (the "License"); you may not use this file except in compliance
* with the License. You may obtain a copy of the License at:
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.nhnent.haste.protocol.messages;

import com.nhnent.haste.protocol.data.DataObject;

public class RequestMessage extends Message {
    public RequestMessage(short code) {
        super(code);
    }

    public RequestMessage(short code, DataObject dataObject) {
        super(code, dataObject);
    }

    @Override
    public MessageType getMessageType() {
        return MessageType.REQUEST_MESSAGE;
    }
}
