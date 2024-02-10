/*
 * The MIT License (MIT)
 *
 * Copyright © 2024 jsepa.io
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the “Software”), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN
 * AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package eu.rbecker.jsepa.information;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Robert Becker <robert at rbecker.eu>
 */
public class BankInformationFactoryTest {

  public BankInformationFactoryTest() {}

  /** Test of getCacheForIban method, of class BankInformationStore. */
  @Test
  public void testForIban() {
    assertEquals("de", BankInformationStore.getCacheForIban("DEXXXX").getCountryCode());
  }

  /** Test of getCacheForCountryCode method, of class BankInformationStore. */
  @Test
  public void testForCountryCode() {
    assertEquals("de", BankInformationStore.getCacheForIban("de").getCountryCode());
    assertEquals("de", BankInformationStore.getCacheForIban("DE").getCountryCode());
  }
}
