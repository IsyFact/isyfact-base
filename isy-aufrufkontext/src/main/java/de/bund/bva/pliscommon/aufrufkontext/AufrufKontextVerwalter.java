/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * The Federal Office of Administration (Bundesverwaltungsamt, BVA)
 * licenses this file to you under the Apache License, Version 2.0 (the
 * License). You may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package de.bund.bva.pliscommon.aufrufkontext;

/** 
 * Container für den aktuellen Aufrufkontext.
 * 
 * Diese Klasse sollte als Bean mit dem scope "thread" verwendet werden:
 * 
 *  <aop:aspectj-autoproxy/>
 *  <bean id="aufrufKontextVerwalter" scope="thread" class="de.bund.bva.pliscommon.aufrufkontext.impl.AufrufKontextVerwalterImpl">
 *       <aop:scoped-proxy/>
 *  </bean>
 * 
 * <p>
 * Siehe: http://www.springbyexample.org/static/0.91/html/ar20.html für Spring 2.5.x
 *
 */
public interface AufrufKontextVerwalter<T extends AufrufKontext> {

    /**
     * liefert den aktuellen AufrufKontext zurück.
     * @return den aktuellen AufrufKontext
     */
    T getAufrufKontext();

    /**
     * setzt den aktuellen AufrufKontext.
     * @param aufrufKontext das zu setzende Objekt.
     */
    void setAufrufKontext(T aufrufKontext);
}
