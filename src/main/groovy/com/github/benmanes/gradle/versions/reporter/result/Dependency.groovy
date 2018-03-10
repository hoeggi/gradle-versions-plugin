package com.github.benmanes.gradle.versions.reporter.result

import groovy.transform.TupleConstructor
import groovy.transform.Sortable

/**
 * A project's dependency
 */
@Sortable
@TupleConstructor(includeFields = true)
class Dependency {
  String group
  String name
  String version
}
