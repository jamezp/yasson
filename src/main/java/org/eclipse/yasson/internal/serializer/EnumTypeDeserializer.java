/*
 * Copyright (c) 2016, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

package org.eclipse.yasson.internal.serializer;

import java.lang.reflect.Type;

import org.eclipse.yasson.internal.Unmarshaller;
import org.eclipse.yasson.internal.model.customization.Customization;

/**
 * Deserializer for {@link Enum} type.
 */
public class EnumTypeDeserializer extends AbstractValueTypeDeserializer<Enum> {

    /**
     * Creates a new instance.
     *
     * @param customization Model customization.
     */
    public EnumTypeDeserializer(Customization customization) {
        super(Enum.class, customization);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected Enum deserialize(String jsonValue, Unmarshaller unmarshaller, Type rtType) {
        return Enum.valueOf((Class<Enum>) rtType, jsonValue);
    }
}
