/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

/**
 * Placement types like alignment, direction, and orientation.
 */
module io.github.mmm.text.search {

  requires transitive io.github.mmm.scanner;

  requires transitive io.github.mmm.text.ascii;

  exports io.github.mmm.text.search;

  exports io.github.mmm.text.search.hit;

  exports io.github.mmm.text.search.query;

  exports io.github.mmm.text.search.spi;

}
