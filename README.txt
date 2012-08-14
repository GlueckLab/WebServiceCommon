/*
 *  Web service utility functions for managing hibernate, json, etc.
 *
 * Copyright (C) 2010 Regents of the University of Colorado.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301, USA.
 */
 
------------------------------
1. INTRODUCTION
------------------------------

The Web Service Common library defines the domain layer for 
web services in the GLIMMPSE software system.  It also provides 
supporting functionality for hibernate and json. 
It is a component of the Glimmpse software system 
(http://glimmpse.samplesizeshop.com/)

------------------------------
2.  LATEST VERSION
------------------------------

Version 1.0.0

------------------------------
3.  DOCUMENTATION
------------------------------

Documentation is available from the project web site:

http://samplesizeshop.com/documentation/glimmpse/

------------------------------
4. DEPENDENCIES
------------------------------

==Third-party dependencies==

Java Runtime Environment 1.6.0 or higher
Hibernate 4.0.0
JUnit 4.7
GSON 2.1
Jasypt 1.9.0

------------------------------
5.  SUPPORT
------------------------------

The Web Service Common library is provided without warranty.

For questions regarding this library, please email sarah.kreidler@ucdenver.edu

------------------------------
6.  ANT BUILD SCRIPT
------------------------------

The main build.xml script is located in the ${WEB_SERVICE_COMMON_HOME}/build
directory.  To compile the application, change to the 
${WEB_SERVICE_COMMON_HOME}/build
directory and type

ant

Artifacts will be created in the directory

${WEB_SERVICE_COMMON_HOME}/build/artifacts/

The two primary artifacts are 

edu.ucdenver.bios.webservice.common-1.0.0.jar  
(for Java applications)
edu.ucdenver.bios.webservice.common-gwt-1.0.0.jar  
(for Google Web Toolkit applications)

The build script assumes that the a directory called thirdparty is
installed at the same directory level as ${POWER_SERVICE_HOME}.
A thirdparty distribution in the appropriate format is available from 

http://samplesizeshop.com/software-downloads/glimmpse-software-downloads/

------------------------------
7. CONTRIBUTORS / ACKNOWLEDGEMENTS
------------------------------

The Web Service Common library was created by Dr. Sarah Kreidler 
and Uttara Sakhadeo at the University of Colorado Denver, 
Department of Biostatistics and Informatics.

Special thanks to the following individuals were instrumental in completion of this project:
Dr. Deb Glueck
Professor Keith E. Muller

