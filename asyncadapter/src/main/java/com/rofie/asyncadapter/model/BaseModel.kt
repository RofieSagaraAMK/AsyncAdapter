/*
 * Copyright 2019 Rofie Sagara.
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


package com.rofie.asyncadapter.model

//
// Created by ROFIE SAGARA on 2/25/2019.
// Copyright (c) 2019 Tamvan Developer. All rights reserved.
//
interface BaseModel<T> {
  /**
   * This function call when find item in list to replace with new items
   * @param other item to compare. recommend use UID or Unique
   * @return true if same false if not
   */
  fun findProperty(other: T): Boolean
}