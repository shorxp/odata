/**
 * Copyright (c) 2014 All Rights Reserved by the SDL Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sdl.odata.test.model;

import com.sdl.odata.api.edm.annotations.EdmAction;
import com.sdl.odata.api.edm.annotations.EdmParameter;
import com.sdl.odata.api.edm.annotations.EdmReturnType;
import com.sdl.odata.api.edm.model.Operation;
import com.sdl.odata.api.processor.datasource.factory.DataSourceFactory;
import com.sdl.odata.api.service.ODataRequestContext;

/**
 * The sample of Unbound Action.
 */
@EdmAction(namespace = "ODataDemo", name = "ODataDemoUnboundAction", entitySetPath = "ODataDemoEntitySetPath",
        isBound = false)
@EdmReturnType(type = "Customers")
public class UnboundActionSample implements Operation<Customer> {

    @EdmParameter(name = "StringParameter", nullable = false)
    private String stringParameter;

    @EdmParameter(name = "NumberParameter", nullable = false)
    private Long number;

    public String getStringParameter() {
        return stringParameter;
    }

    public Long getNumber() {
        return number;
    }

    @Override
    public Customer doOperation(ODataRequestContext requestContext,
                                DataSourceFactory dataSourceFactory) {
        // Doesn't return anything because there is no possibility to implement it without datasource.
        return null;
    }
}