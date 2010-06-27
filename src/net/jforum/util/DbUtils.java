/*
 * Copyright (c) JForum Team
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms,
 * with or without modification, are permitted provided
 * that the following conditions are met:
 *
 * 1) Redistributions of source code must retain the above
 * copyright notice, this list of conditions and the
 * following  disclaimer.
 * 2)  Redistributions in binary form must reproduce the
 * above copyright notice, this list of conditions and
 * the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 * 3) Neither the name of "Rafael Steil" nor
 * the names of its contributors may be used to endorse
 * or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT
 * HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER
 * IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE
 *
 * The JForum Project
 * http://www.jforum.net
 * 19.08.2006 21:50:05
 */
package net.jforum.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

/**
 * General utility methods to close statements and resultsets
 * 
 * @author Serge Maslyukov
 * @version $Id: DbUtils.java,v 1.3 2006/09/24 16:10:14 rafaelsteil Exp $
 */
public final class DbUtils
{
	private static final Logger LOGGER = Logger.getLogger(DbUtils.class);
	
	public static void close(final ResultSet resultSet, final Statement stmt)
	{
		close(resultSet);
		close(stmt);
	}

	public static void close(final ResultSet resultSet)
	{
		if (resultSet != null) {
			try {
				resultSet.close();
			}
			catch (Exception e) {				
				LOGGER.error(e.getMessage(), e);
			}
		}
	}

	public static void close(final Statement stmt)
	{
		if (stmt != null) {
			try {
				stmt.close();
			}
			catch (SQLException e) { 
				LOGGER.error(e.getMessage(), e); 
			}
		}
	}
	
	private DbUtils() {}
}
