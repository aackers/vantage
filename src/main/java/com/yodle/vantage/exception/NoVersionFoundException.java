/*
 * Copyright 2016 Yodle, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yodle.vantage.exception;

public class NoVersionFoundException extends RuntimeException {
    private final String component;
    private final String version;

    public NoVersionFoundException(String component, String version) {
        super("Could not find version [" + version + "] for component [" + component + "]");
        this.component = component;
        this.version = version;
    }
}