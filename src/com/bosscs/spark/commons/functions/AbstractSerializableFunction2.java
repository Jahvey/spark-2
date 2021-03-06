/*
 * Copyright 2016, Jerry Xiong, BOSSCS
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

package com.bosscs.spark.commons.functions;

import java.io.Serializable;

import scala.runtime.AbstractFunction2;

/**
 * Created by Jerry Xiong on 14/04/15.
 */
public abstract class AbstractSerializableFunction2<T1, T2, R> extends AbstractFunction2<T1, T2,
        R> implements Serializable {

}
