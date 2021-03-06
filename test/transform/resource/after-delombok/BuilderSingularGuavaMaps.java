import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableSortedMap;
class BuilderSingularGuavaMaps<K, V> {
	private ImmutableMap<K, V> battleaxes;
	private ImmutableSortedMap<Integer, ? extends V> vertices;
	@SuppressWarnings("all")
	private ImmutableBiMap rawMap;
	@java.lang.SuppressWarnings("all")
	BuilderSingularGuavaMaps(final ImmutableMap<K, V> battleaxes, final ImmutableSortedMap<Integer, ? extends V> vertices, final ImmutableBiMap rawMap) {
		this.battleaxes = battleaxes;
		this.vertices = vertices;
		this.rawMap = rawMap;
	}
	@java.lang.SuppressWarnings("all")
	public static class BuilderSingularGuavaMapsBuilder<K, V> {
		private com.google.common.collect.ImmutableMap.Builder<K, V> battleaxes;
		private com.google.common.collect.ImmutableSortedMap.Builder<Integer, V> vertices;
		private com.google.common.collect.ImmutableBiMap.Builder<java.lang.Object, java.lang.Object> rawMap;
		@java.lang.SuppressWarnings("all")
		BuilderSingularGuavaMapsBuilder() {
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularGuavaMapsBuilder<K, V> battleaxe(final K battleaxe$key, final V battleaxe$value) {
			if (this.battleaxes == null) this.battleaxes = com.google.common.collect.ImmutableMap.builder();
			this.battleaxes.put(battleaxe$key, battleaxe$value);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularGuavaMapsBuilder<K, V> battleaxes(final java.util.Map<? extends K, ? extends V> battleaxes) {
			if (this.battleaxes == null) this.battleaxes = com.google.common.collect.ImmutableMap.builder();
			this.battleaxes.putAll(battleaxes);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularGuavaMapsBuilder<K, V> vertex(final Integer vertex$key, final V vertex$value) {
			if (this.vertices == null) this.vertices = com.google.common.collect.ImmutableSortedMap.naturalOrder();
			this.vertices.put(vertex$key, vertex$value);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularGuavaMapsBuilder<K, V> vertices(final java.util.Map<? extends Integer, ? extends V> vertices) {
			if (this.vertices == null) this.vertices = com.google.common.collect.ImmutableSortedMap.naturalOrder();
			this.vertices.putAll(vertices);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularGuavaMapsBuilder<K, V> rawMap(final java.lang.Object rawMap$key, final java.lang.Object rawMap$value) {
			if (this.rawMap == null) this.rawMap = com.google.common.collect.ImmutableBiMap.builder();
			this.rawMap.put(rawMap$key, rawMap$value);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularGuavaMapsBuilder<K, V> rawMap(final java.util.Map<?, ?> rawMap) {
			if (this.rawMap == null) this.rawMap = com.google.common.collect.ImmutableBiMap.builder();
			this.rawMap.putAll(rawMap);
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public BuilderSingularGuavaMaps<K, V> build() {
			com.google.common.collect.ImmutableMap<K, V> battleaxes = this.battleaxes == null ? com.google.common.collect.ImmutableMap.<K, V>of() : this.battleaxes.build();
			com.google.common.collect.ImmutableSortedMap<Integer, V> vertices = this.vertices == null ? com.google.common.collect.ImmutableSortedMap.<Integer, V>of() : this.vertices.build();
			com.google.common.collect.ImmutableBiMap<java.lang.Object, java.lang.Object> rawMap = this.rawMap == null ? com.google.common.collect.ImmutableBiMap.<java.lang.Object, java.lang.Object>of() : this.rawMap.build();
			return new BuilderSingularGuavaMaps<K, V>(battleaxes, vertices, rawMap);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "BuilderSingularGuavaMaps.BuilderSingularGuavaMapsBuilder(battleaxes=" + this.battleaxes + ", vertices=" + this.vertices + ", rawMap=" + this.rawMap + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	public static <K, V> BuilderSingularGuavaMapsBuilder<K, V> builder() {
		return new BuilderSingularGuavaMapsBuilder<K, V>();
	}
}