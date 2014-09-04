/*
 * Copyright 2014, Stratio.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stratio.deep.config;

import com.stratio.deep.entity.Cells;

import java.lang.reflect.Method;

/**
 * Created by rcrespo on 29/07/14.
 */
public class CellDeepJobConfigES extends GenericDeepJobConfigES<Cells> {

    private static final long serialVersionUID = -598862509865396541L;
    private Cells dummyCells;

    public CellDeepJobConfigES() {
    }

    {
        dummyCells = new Cells();
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<Cells> getEntityClass() {
        return (Class<Cells>) dummyCells.getClass();
    }



}