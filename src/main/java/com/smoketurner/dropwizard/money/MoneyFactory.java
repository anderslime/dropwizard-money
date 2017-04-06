/**
 * Copyright 2017 Smoke Turner, LLC.
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
package com.smoketurner.dropwizard.money;

import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MoneyFactory {

    @NotEmpty
    private String defaultCurrencyCode = "USD";

    @JsonProperty
    public String getDefaultCurrencyCode() {
        return defaultCurrencyCode;
    }

    @JsonProperty
    public void setDefaultCurrencyCode(String currencyCode) {
        this.defaultCurrencyCode = currencyCode;
    }
}