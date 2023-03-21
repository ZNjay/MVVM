package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new cn.rover.demo.DataBinderMapperImpl());
  }
}
