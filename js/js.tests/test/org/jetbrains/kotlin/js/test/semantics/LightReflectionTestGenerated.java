/*
 * Copyright 2010-2016 JetBrains s.r.o.
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

package org.jetbrains.kotlin.js.test.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/reflection/light/cases")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class LightReflectionTestGenerated extends AbstractLightReflectionTest {
    public void testAllFilesPresentInCases() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("js/js.translator/testData/reflection/light/cases"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("jsClass.kt")
    public void testJsClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/reflection/light/cases/jsClass.kt");
        doTest(fileName);
    }

    @TestMetadata("jsClassName.kt")
    public void testJsClassName() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/reflection/light/cases/jsClassName.kt");
        doTest(fileName);
    }

    @TestMetadata("jsClassOnReifiedType.kt")
    public void testJsClassOnReifiedType() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("js/js.translator/testData/reflection/light/cases/jsClassOnReifiedType.kt");
        doTest(fileName);
    }
}
