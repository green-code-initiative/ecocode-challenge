/*
 * ecoCode SonarQube Plugin
 * Copyright (C) 2020-2021 Snapp' - Université de Pau et des Pays de l'Adour
 * mailto: contact@ecocode.io
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package io.ecocode.java.checks.bottleneck;

import io.ecocode.java.checks.helpers.SpecificMethodCheck;
import org.sonar.check.Rule;

/**
 * Check that `install` method of android.net.http.HttpResponseCache is called
 */
@Rule(key = "EBOT004", name = "UncachedDataReception")
public class UncachedDataReceptionRule extends SpecificMethodCheck {

  private static final String ERROR_MESSAGE = "Catching all of the application's HTTP responses to the filesystem.";
  private static final String METHOD_NAME = "install";
  private static final String METHOD_OWNER_TYPE = "android.net.http.HttpResponseCache";

  public UncachedDataReceptionRule() {
    super(METHOD_OWNER_TYPE, METHOD_NAME);
  }

  @Override
  public String getMessage() {
    return ERROR_MESSAGE;
  }
}
