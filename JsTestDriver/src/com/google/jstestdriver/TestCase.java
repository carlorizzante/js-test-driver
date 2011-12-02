/*
 * Copyright 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.jstestdriver;

import java.util.List;

import com.google.common.base.Joiner;

/**
 * Model for reporting tests.
 * @author jeremiele@google.com (Jeremie Lenfant-Engelmann)
 */
// TODO(corysmith): Rename so it quits coming up in auto complete.
public class TestCase {

  private String name;
  private List<String> tests;

  public TestCase() {
  }

  public TestCase(String name, List<String> tests) {
    this.name = name;
    this.tests = tests;
  }

  public String getName() {
    return name;
  }

  public List<String> getTests() {
    return tests;
  }

  @Override
  public String toString() {
    return "\n" + name + "\n\t" + Joiner.on("\n\t").join(tests) + "\n";
  }
}
