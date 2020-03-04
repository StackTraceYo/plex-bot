package org.stacktrace.yo.plexbot.models.shared;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Routes {


    public static final class Ombi {

        public static final class Search {

            public static final String path = "/api/v1/Search/";

            public static String create(SearchType sType, String params) {
                return path + sType.getReqValue() + "/" + encode(params);
            }


            public static final class TV {
                public static final String path = "/api/v1/Search/Tv/";

                public static String create(String params) {
                    return path + params;
                }

                public static final class Detail {
                    public static final String path = "/api/v1/search/Tv/info/";

                    public static String create(String params) {
                        return path + params;
                    }

                }
            }

            public static final class Movie {
                public static final String path = "/api/v1/Search/Movie/";

                public static String create(String params) {
                    return path + params;
                }

            }

        }

        public static final class Request {

            public static final class TV {
                public static final String path = "/api/v1/Request/TV/";

                public static String create(String params) {
                    return path + params;
                }

            }

            public static final class Movie {
                public static final String path = "/api/v1/Request/Movie/";

                public static String create(String params) {
                    return path + params;
                }

            }
        }
    }

    public static final class TMDb {
        private static final String TMDB_API_BASE = "https://api.themoviedb.org/3";

        public static final String path = TMDB_API_BASE;

        public static final class Search {


            public static final class Movie {
                public static final String path = TMDB_API_BASE+ "/search/movie";

                public static String create(String query) {
                    return path + query;
                }

            }

            public static final class TV {
                public static final String path = TMDB_API_BASE +"/search/tv";

                public static String create(String query) {
                    return path + query;
                }

            }

        }

    }

    public static final class TVDb {
        private static final String TVDB_API_BASE = "https://api.thetvdb.com/";

        public static final String path = TVDB_API_BASE;

        public static final class Search {

            public static final class TV {
                public static final String path = TVDB_API_BASE +"/search/tv";

                public static String create(String query) {
                    return path + query;
                }

            }

        }

    }

    public static String encode(String value) {

        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return value;
        }
    }
}