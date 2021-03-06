/*
 * Copyright (C) 2014 konik.io
 *
 * This file is part of Konik library.
 *
 * Konik library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Konik library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Konik library.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.konik.util;

/**
 * 
 * The Strings helper class. We can avoid importing Guava or Apache commons for now.
 */
public class Strings {

   private Strings() {
   }

   /**
    * Null to empty.
    *
    * @param string the string
    * @return the string
    */
   public static String nullToEmpty(String string) {
      return (string == null) ? "" : string;
   }

   /**
    * Empty to null.
    *
    * @param string the string
    * @return the string
    */
   public static String emptyToNull(String string) {
      return isNullOrEmpty(string) ? null : string;
   }

   /**
    * Checks if is null or empty.
    *
    * @param string the string
    * @return true, if is null or empty
    */
   public static boolean isNullOrEmpty(String string) {
      return string == null || string.isEmpty();
   }

   /**
    * Checks if is not null or empty.
    *
    * @param string the string
    * @return true, if is not null or empty
    */
   public static boolean isNotEmpty(String string) {
      return !isNullOrEmpty(string);
   }
}
