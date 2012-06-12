/*
 * Copyright 2012 McEvoy Software Ltd.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.milton.http.acl;

import io.milton.http.acl.Principal;
import io.milton.http.webdav.WebDavProtocol;
import javax.xml.namespace.QName;

/**
 *
 * @author brad
 */
public class HrefPrincipleId implements Principal.PrincipleId {

    private final QName type;
    private final String url;

    public HrefPrincipleId(String url) {
        this.url = url;
        this.type = new QName(WebDavProtocol.DAV_URI, "href");
    }

    @Override
    public QName getIdType() {
        return type;
    }

    @Override
    public String getValue() {
        return url;
    }

    @Override
    public String toString() {
        return url;
    }
}
